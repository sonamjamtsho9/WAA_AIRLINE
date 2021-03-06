package edu.mum.cs545.ws;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cs545.airline.model.Airline;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.service.FlightService;

@Path("Flight")
public class FlightController {
	private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
	@Inject
	private FlightService flightService;

	// Create new airplane
	// @POST
	// @Path("create")
	// @Consumes(MediaType.APPLICATION_JSON)
	// @Produces(MediaType.APPLICATION_JSON)
	// public Response createFlight(Flight flight) {
	// try {
	// flightService.create(flight);
	// return Response.ok(flight).build();
	// } catch (Exception e) {
	// return Response.serverError().entity("Operation failed!").build();
	// }
	// }
	//
	// // Delete airplane
	// @DELETE
	// @Path("delete")
	// @Produces(MediaType.APPLICATION_JSON)
	// @Consumes(MediaType.APPLICATION_JSON)
	// public Response deleteFlight(Flight flight) {
	// try {
	// flightService.delete(flight);
	// return Response.ok(flight).build();
	// } catch (Exception e) {
	// return Response.serverError().entity(flight + "Not found").build();
	// }
	// }

	// Update airplane
	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateFlight(Flight flight) {
		try {
			flightService.update(flight);
			return Response.ok(flight).build();
		} catch (Exception e) {
			return Response.serverError().entity("Update failed!").build();
		}
	}

	// find one
	@GET
	@Path("findFlight/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOneName(@PathParam("id") String id) {
		Flight flight = new Flight();
		flight.setId(Long.parseLong(id));
		try {
			flightService.find(flight);
			return Response.ok(flight, MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Flight not found by " + id).build();
		}
	}

	// Find by Number
	@GET
	@Path("ByNumber/{flightnr}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getByNumber(@PathParam("flightnr") String flightnr) {
		List<Flight> listOfFlight = flightService.findByNumber(flightnr);
		return listOfFlight;
	}

	// Find by Airline
	@GET
	@Path("ByAirline/{airid}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getByAirline(@PathParam("airid") String airid) {
		Airline airline = new Airline();
		airline.setId(Long.parseLong(airid));
		List<Flight> listOfAirline = flightService.findByAirline(airline);
		return listOfAirline;
	}

	// Find by origin
	@GET
	@Path("ByOrigin/{origid}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getByOrigin(@PathParam("origid") String origid) {
		Airport airport = new Airport();
		airport.setId(Long.parseLong(origid));
		List<Flight> byOrigin = flightService.findByOrigin(airport);
		return byOrigin;
	}

	// Find by Destination
	@GET
	@Path("ByDestination/{desid}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getByDestination(@PathParam("desid") String desid) {
		Airport airport = new Airport();
		airport.setId(Long.parseLong(desid));
		List<Flight> byDest = flightService.findByDestination(airport);
		return byDest;
	}

	// Find by Arrival Time
	@GET
	@Path("ByArrival/{arrdate}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getByArrivalTime(@PathParam("arrdate") String arrdate) {
		Date ad = null;
		try {
			ad = df.parse(arrdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Flight> byArrival = flightService.findByArrival(ad);
		return byArrival;
	}

	// Find by Departure Time
	@GET
	@Path("ByDepart/{ddate}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getByDepartureTime(@PathParam("ddate") String ddate) {
		Date dd = null;
		try {
			dd = df.parse(ddate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Flight> byArrival = flightService.findByArrival(dd);
		return byArrival;
	}

	// List all Flight
	@GET
	@Path("listall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Flight> getAllFlight() {
		List<Flight> list = new ArrayList<>();

		if (flightService.findAll() != null) {
			list = flightService.findAll();
		}
		return list;
	}

}