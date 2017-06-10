package edu.mum.cs545.ws;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cs545.airline.model.Airline;
import cs545.airline.model.Flight;
import cs545.airline.service.AirlineService;

@Path("airline")
public class AirlineController {

	@Inject
	private AirlineService airlineService;

	// Get Flight id and name by passing flight name as URL Parameter - find one
	@GET
	@Path("{fname}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findByName(@PathParam("fname") String fname) {
		Airline flight = new Airline();
		flight.setName(fname);
		try {
			flight = airlineService.findByName(fname);
			return Response.ok(flight, MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Flight not found by the flight name " + fname)
					.build();
		}

	}

	// Create new airline
	@POST
	@Path("create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAirline(Airline airline) {
		try {
			airlineService.create(airline);
			return Response.ok(airline).build();
		} catch (Exception e) {
			return Response.serverError().entity("Operation failed!").build();
		}
	}

	// Delete airline
	@DELETE
	@Path("delete")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteAirline(Airline airport) {
		try {
			airlineService.delete(airport);
			return Response.ok(airport).build();
		} catch (Exception e) {
			return Response.serverError().entity(airport + "Not found").build();
		}
	}

	// Update airline
	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateAirline(Airline airline) {
		try {
			airlineService.update(airline);
			return Response.ok(airline).build();
		} catch (Exception e) {
			return Response.serverError().entity("Update failed!").build();
		}
	}

	// Find flight by id
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("ID/{id}")
	public Response findByID(@PathParam("id") int id) {
		Airline flightID = new Airline();
		flightID.setId(id);

		try {
			flightID = airlineService.find(flightID);
			return Response.ok(flightID, MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Flight ID " + id + "not found").build();
		}

	}

	// List all the flight by passing flight name
	@GET
	@Path("flight/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airline> getByFlight(@PathParam("name") String name) {
		List<Airline> flight = new ArrayList<>();
		Airline airline = airlineService.findByName(name);
		List<Flight> listFlight = airline.getFlights();
		for (Flight fg : listFlight) {
			flight.addAll(airlineService.findByFlight(fg));
		}
		return flight;

	}

	// List flights by flight id and name
	@GET
	@Path("listall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airline> getAllFlight() {
		List<Airline> list = new ArrayList<>();

		if (airlineService.findAll() != null) {
			list = airlineService.findAll();
		}
		return list;
	}

}