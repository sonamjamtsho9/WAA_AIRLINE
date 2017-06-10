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

import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.AirportService;

@Path("airport")
public class AirportController {

	@Inject
	private AirportService AirportService;

	// Create new airport
	@POST
	@Path("create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAirport(Airport Airport) {
		try {
			AirportService.create(Airport);
			return Response.ok(Airport).build();
		} catch (Exception e) {
			return Response.serverError().entity("Operation failed!").build();
		}
	}

	// Delete Airport
	@DELETE
	@Path("delete")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteAirport(Airport airport) {
		try {
			AirportService.delete(airport);
			return Response.ok(airport).build();
		} catch (Exception e) {
			return Response.serverError().entity(airport + "Not found").build();
		}

	}

	// Update Airport
	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateAirport(Airport airport) {
		try {
			AirportService.update(airport);
			return Response.ok(airport).build();
		} catch (Exception e) {
			return Response.serverError().entity("Update failed!").build();
		}
	}

	// find one
	@GET
	@Path("find/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOne(@PathParam("id") String id) {
		Airport airport = new Airport();
		airport.setId(Long.parseLong(id));
		try {
			AirportService.find(airport);
			return Response.ok(airport, MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Flight not found by " + id).build();
		}

	}

	// Find by AirportCode
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("airportcode/{airportcode}")
	public Response findByAirportCode(@PathParam("airportCode") String airportcode) {
		Airport airport = new Airport();
		airport.setAirportcode(airportcode);
		try {
			airport = AirportService.findByCode(airportcode);
			return Response.ok(airport, MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Flight ID " + airportcode + " not found").build();
		}

	}

	// Find by Arrival
	@GET
	@Path("Arrival/{acode}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> getByArrival(@PathParam("code") String code) {
		List<Airport> listOfAirport = new ArrayList<>();
		Airport airport = AirportService.findByCode(code);
		List<Flight> listOfFlight = airport.getArrivals();
		for (Flight fg : listOfFlight) {
			listOfAirport.addAll(AirportService.findByArrival(fg));
		}
		return listOfAirport;

	}

	// Find by Departure
	@GET
	@Path("Departure/{dcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> getByDepart(@PathParam("code") String code) {
		List<Airport> listOfAirport = new ArrayList<>();
		Airport airport = AirportService.findByCode(code);
		List<Flight> listOfFlight = airport.getDepartures();
		for (Flight fg : listOfFlight) {
			listOfAirport.addAll(AirportService.findByDeparture(fg));
		}
		return listOfAirport;

	}

	// Find by City
	@GET
	@Path("City/{cname}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> getByCity(@PathParam("cname") String cname) {
		List<Airport> listOfCity = AirportService.findByCity(cname);
		return listOfCity;
	}

	// Find by Country
	@GET
	@Path("Country/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> getByCountry(@PathParam("name") String name) {
		List<Airport> listOfCountry = AirportService.findByCity(name);
		return listOfCountry;
	}

	// Find by Name
	@GET
	@Path("ByName/{bname}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> getByName(@PathParam("bname") String bname) {
		List<Airport> listByName = AirportService.findByName(bname);
		return listByName;
	}

	// List all Airport
	@GET
	@Path("listall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airport> getAllFlight() {
		List<Airport> list = new ArrayList<>();

		if (AirportService.findAll() != null) {
			list = AirportService.findAll();
		}
		return list;
	}

}