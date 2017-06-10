package cs545.airline.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import cs545.airline.model.Airline;
import cs545.airline.model.Airport;
import cs545.airline.model.Flight;
import cs545.airline.model.Query;

@Named
@ViewScoped
public class CommonService implements Serializable {
	private static final long serialVersionUID = 1L;
	// git hub
	@Inject
	private FlightService flightService;
	@Inject
	private AirlineService airlineService;
	@Inject
	private AirportService airportService;

	private Query flightQuery;

	// date-time, airline, departure, and destination

	private List<Flight> listFlight;

	@PostConstruct
	public void findAllFlight() {
		flightQuery = new Query();
		listFlight = flightService.findAll();
	}

	public void SearchFlight() {
		if (flightQuery == null
				|| ("".equals(flightQuery.getAirlineName()) && "".equals(flightQuery.getOriginAirportCode())
						&& "".equals(flightQuery.getDestinationAirportCode()))) {
			listFlight = flightService.findAll();
		} else {

			if (flightQuery.getAirlineName() != null && !"".equals(flightQuery.getAirlineName())) {
				Airline airlineNew = airlineService.findByName(flightQuery.getAirlineName());
				if (airlineNew != null) {
					listFlight = flightService.findByAirline(airlineNew);
				}
			}

			if (flightQuery.getOriginAirportCode() != null && !"".equals(flightQuery.getOriginAirportCode())) {
				Airport airportNew = airportService.findByCode(flightQuery.getOriginAirportCode());
				if (airportNew != null) {
					if (listFlight != null) {
						List<Flight> listFlight1 = flightService.findByOrigin(airportNew);
						List<Flight> listFlight2 = new ArrayList<Flight>();
						for (Flight flight : listFlight1) {
							if (listFlight.contains(flight)) {
								listFlight2.add(flight);
							}
						}
						listFlight = new ArrayList<Flight>(listFlight2);
					} else {
						listFlight = flightService.findByOrigin(airportNew);
					}
				}
			}

			if (flightQuery.getDestinationAirportCode() != null
					&& !"".equals(flightQuery.getDestinationAirportCode())) {
				Airport airportNew = airportService.findByCode(flightQuery.getDestinationAirportCode());
				if (airportNew != null) {
					if (listFlight != null) {
						List<Flight> listFlight1 = flightService.findByDestination(airportNew);
						List<Flight> listFlight2 = new ArrayList<Flight>();
						for (Flight flight : listFlight1) {
							if (listFlight.contains(flight)) {
								listFlight2.add(flight);
							}
						}
						listFlight = new ArrayList<Flight>(listFlight2);
					} else {
						listFlight = flightService.findByDestination(airportNew);
					}
				}
			}

		}
	}

	public List<Flight> getListFlight() {
		return listFlight;
	}

	public void setListFlight(List<Flight> listFlight) {
		this.listFlight = listFlight;
	}

	public Query getSearchQuery() {
		return flightQuery;
	}

	public void setQuery(Query flightQuery) {
		this.flightQuery = flightQuery;
	}

}