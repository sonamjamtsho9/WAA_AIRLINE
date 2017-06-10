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

import cs545.airline.model.Airplane;
import cs545.airline.model.Flight;
import cs545.airline.service.AirplaneService;

@Path("airplane")
public class AirplaneController {

	@Inject
	private AirplaneService airplaneService;

	// Create new airplane
	@POST
	@Path("create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createAirplane(Airplane airplane) {
		try {
			airplaneService.create(airplane);
			return Response.ok(airplane).build();
		} catch (Exception e) {
			return Response.serverError().entity("Operation failed!").build();
		}
	}

	// Delete airplane
	@DELETE
	@Path("delete")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteAirplane(Airplane plane) {
		try {
			airplaneService.delete(plane);
			return Response.ok(plane).build();
		} catch (Exception e) {
			return Response.serverError().entity(plane + "Not found").build();
		}

	}

	// Update airplane
	@PUT
	@Path("update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateAirplane(Airplane plane) {
		try {
			airplaneService.update(plane);
			return Response.ok(plane).build();
		} catch (Exception e) {
			return Response.serverError().entity("Update failed!").build();
		}
	}

	// find one
	@GET
	@Path("findone/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOneName(@PathParam("id") String id) {
		Airplane plane = new Airplane();
		plane.setId(Long.parseLong(id));
		try {
			airplaneService.find(plane);
			return Response.ok(plane, MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Flight not found by " + id).build();
		}

	}

	// Find by Serial number
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("serial/{sn}")
	public Response findBySerialNo(@PathParam("sn") String sn) {
		Airplane plane = new Airplane();
		plane.setSerialnr(sn);
		try {
			plane = airplaneService.findBySrlnr(sn);
			return Response.ok(plane, MediaType.APPLICATION_JSON).build();
		} catch (Exception e) {
			return Response.status(Response.Status.NOT_FOUND).entity("Flight ID " + sn + " not found").build();
		}

	}

	// List by flight
	@GET
	@Path("flight/{sn}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airplane> getByFlight(@PathParam("sn") String sn) {
		List<Airplane> listOfPlane = new ArrayList<>();
		Airplane plane = airplaneService.findBySrlnr(sn);
		List<Flight> listOfFlight = plane.getFlights();
		for (Flight fg : listOfFlight) {
			listOfPlane.addAll(airplaneService.findByFlight(fg));
		}
		return listOfPlane;

	}

	// List by Model
	@GET
	@Path("model/{modelno}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airplane> getByModel(@PathParam("modelno") String modelno) {
		List<Airplane> listOfPlane = airplaneService.findByModel(modelno);
		return listOfPlane;
	}

	// List all Airplane
	@GET
	@Path("listall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Airplane> getAllFlight() {
		List<Airplane> list = new ArrayList<>();

		if (airplaneService.findAll() != null) {
			list = airplaneService.findAll();
		}
		return list;
	}

}