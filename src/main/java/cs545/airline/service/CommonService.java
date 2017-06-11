package cs545.airline.service;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

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

	@Inject
	private FlightService flightService;
	@Inject
	private AirlineService airlineService;
	@Inject
	private AirportService airportService;

	private Query flightQuery;

	private List<Flight> listFlight;

	private static DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);

	@PostConstruct
	public void findAllFlight() {
		flightQuery = new Query();
		listFlight = flightService.findAll();
	}

	public void filter() {
		if (flightQuery == null
				|| ("".equals(flightQuery.getAirlineName()) && "".equals(flightQuery.getOriginAirportCode())
						&& "".equals(flightQuery.getDestinationAirportCode()))) {
			listFlight = flightService.findAll();
		} else {

			if (flightQuery.getAirlineName() != null && !"".equals(flightQuery.getAirlineName())) {
				Airline airline = airlineService.findByName(flightQuery.getAirlineName());
				if (airline != null) {
					listFlight = flightService.findByAirline(airline);
				}
			}
			if (flightQuery.getDepartureTime() != null && !"".equals(flightQuery.getDepartureTime())) {
				Date dd = null;
				try {
					dd = df.parse(flightQuery.getDepartureTime());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				listFlight = flightService.findByDeparture(dd);
			}
			if (flightQuery.getArrivalTime() != null && !"".equals(flightQuery.getArrivalTime())) {
				Date ad = null;
				try {
					ad = df.parse(flightQuery.getArrivalTime());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				listFlight = flightService.findByDeparture(ad);
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

	public void createFromJSF() {
		Airline airline = new Airline();
		airline.setName(flightQuery.getAirlineName());
		airlineService.create(airline);
	}

	public void deleteFromJSF() {

		Airline airline = new Airline();
		airline.setId(flightQuery.getId());
		airlineService.delete(airline);

	}

	public void updateFromJSF() {

		Airline airline = new Airline();

		airline.setId(flightQuery.getId());
		airline.setName(flightQuery.getAirlineName());
		airlineService.update(airline);
	}

	public List<Flight> getListFlight() {
		return listFlight;
	}

	public void setListFlight(List<Flight> listFlight) {
		this.listFlight = listFlight;
	}

	public Query getFlightQuery() {
		return flightQuery;
	}

	public void setFlightQuery(Query flightQuery) {
		this.flightQuery = flightQuery;
	}

}