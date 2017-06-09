package edu.mum.cs545.ws;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import cs545.airline.model.Airline;
import cs545.airline.service.AirlineService;


@Named
@RequestScoped
@Path("hello")
public class AirController {

	@Inject
	private AirlineService airLineService ;
	public AirController() {
		
	}
	
	//List all the  flight by flight id and flight name ggg
	
	@Path("airline/listall")
	@GET
	public List<Airline> getAllFlight() {
		List<Airline> list = new ArrayList<>();;
		
		if (airLineService.findAll() != null) {
			list = airLineService.findAll();
		}
		return list;
	}
	

}
