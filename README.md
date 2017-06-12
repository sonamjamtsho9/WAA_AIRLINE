# WAA_AIRLINE
# EXPOSE OF APPLICATION SERVICES AS REST WEB SERVICES
# Airline Service
  	1. Create
  		1. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		2. URL Path:<http://localhost:8080/airlinesWebApp/rs/airline/create>
  		3. Response (interface) is used to display the response message
  	2. Delete
  		1. DELETE method is used to delete a record. JSON format is passed on as a raw input as part of the body message
  		2. URL Path:  http://localhost:8080/airlinesWebApp/rs/airline/delete
  		3. Response (interface) is used to display the response message
  	3. Update 
  		1. PUT Method is used to update the record. JSON format is passed. 
  		2. URL Path:  http://localhost:8080/airlinesWebApp/rs/airline/update
  		3. Response (interface) is used to display the response message 
  	4. Get flight id and name in JSON format by passing flight name is URL Parameter (Find one)
  		1. GET method is used to retrieve the details
  		2. URL Path (@Path("{fname}"): http://localhost:8080/airlinesWebApp/rs/airline/{fname}
  		3. Response (interface) is used to display the response message
  	5. Get a flight name by pass the ID as URL Param
  		1. GET method is used to retrieve the information
  		2.  URL Path: http://localhost:8080/airlinesWebApp/rs/airline/{id}
  		3. Response (interface) is used to display the response message
  	6. List all the flights
  		1. GET method is used to retrieve the information
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airline/listall
  	7. List the flight by passing flight name as URL parameter
  		1. GET method is used to retrieve the information
  		2.  URL Path: http://localhost:8080/airlinesWebApp/rs/airline/flight/{name}
  		3. Response (interface) is used to display the response message
  	
# Airplane Service
 	1: Create
  		1. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/create
  		3. Response (interface) is used to display the response message
  	2. Delete
  		1. DELETE method is used to delete a record. JSON format is passed on as a raw input as part of the body message
  		2. URL Path:  http://localhost:8080/airlinesWebApp/rs/airplane/delete
  		3. Response (interface) is used to display the response message
 	3. Update 
  		1. PUT Method is used to update the record. JSON format is passed. 
  		2. URL Path:  http://localhost:8080/airlinesWebApp/rs/airplane/update
  		3. Response (interface) is used to display the response message 
  	4. Find one
  		1. GET method is used to retrieve the details
  		2. URL Path (@Path("findone/{id}), http://localhost:8080/airlinesWebApp/rs/airplane/findone{id}
  		3. Response (interface) is used to display the response message
  	5. Find by Serial Number
  		1. GET method is used to retrieve the information
  		2.  URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/serial/{sn}
  		3. Response (interface) is used to display the response message
  	6. List all the flights
  		1. GET method is used to retrieve the information
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/flight/{sn}
  	7. List by Model
  		1. GET method is used to retrieve the information
  		2.  URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/model/{modelno}
  	8. List all
  		1. GET method is used to retrieve the information
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/listall
  		
# Airport Service
  	1: Create
  		1. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/create
  		3. Response (interface) is used to display the response message
  	2. Delete
  		1. DELETE method is used to delete a record. JSON format is passed on as a raw input as part of the body message
  		2. URL Path:  http://localhost:8080/airlinesWebApp/rs/airport/delete
  		3. Response (interface) is used to display the response message
 	3. Update 
  		1. PUT Method is used to update the record. JSON format is passed. 
  		2. URL Path:  http://localhost:8080/airlinesWebApp/rs/airport/update
  		3. Response (interface) is used to display the response message 
  	4. Find one
  		1. GET method is used to retrieve the details
  		2. URL Path (@Path("find/{id}), http://localhost:8080/airlinesWebApp/rs/airport/find{id}
  		3. Response (interface) is used to display the response message
  	5. Find by AirportCode
  		1. GET method is used to retrieve the information
  		2.  URL Path: http://localhost:8080/airlinesWebApp/rs/airport/airportcode/{airportcode}
  		3. Response (interface) is used to display the response message
  	6. Find by Arrival
  		1. GET method is used to retrieve the information (list)
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/Arrival/{acode}
  	7. Find by Departure
  		1. GET method is used to retrieve the information (list)
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/Departure/{dcode}
  	8. Find by City
  		1. GET method is used to retrieve the information (list)
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/City/{cname}
  	9. Find by Country
  		1. GET method is used to retrieve the information (list)
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/Country/{name}
  	10. Find by Name
  		1. GET method is used to retrieve the information (list)
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/ByName/{bname}
  	11. List all
  		1. GET method is used to retrieve the information
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/listall
  # Flight Service
   	1: Create
  		1. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/create
  		3. Response (interface) is used to display the response message
  	2. Delete
  		1. DELETE method is used to delete a record. JSON format is passed on as a raw input as part of the body message
  		2. URL Path:  http://localhost:8080/airlinesWebApp/rs/Flight/delete
  		3. Response (interface) is used to display the response message
 	3. Update 
  		1. PUT Method is used to update the record. JSON format is passed. 
  		2. URL Path:  http://localhost:8080/airlinesWebApp/rs/Flight/update
  		3. Response (interface) is used to display the response message 
  	4. Find one
  		1. GET method is used to retrieve the details
  		2. URL Path (@Path("find/{id}), http://localhost:8080/airlinesWebApp/rs/Flight/findFlight/{id}
  		3. Response (interface) is used to display the response message
  	5. Find by Flight number
  		1. GET method is used to retrieve the information
  		2.  URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/airportcode/ByNumber/{flightnr}
  	6. Find by Airline
  		1. GET method is used to retrieve the information (list)
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/ByAirline/{airid}
  	7. Find by Origin
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/ByOrigin/{origid}
  	8. Find by Destination
  		1. GET method is used to retrieve the information (list)
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/ByDestination/{desid}
  	9. Find by Arrival 
  		1. GET method is used to retrieve the information (list)
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/ByArrival/{arrid}
  	10. List all
  		1. GET method is used to retrieve the information
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/listall
  # JSF Web Application
  	1. Set up for the Web application
  		1. Two java classes were implemented to provide as the common service to list the flight details and as DAO.
  		2. A simple CSS is created to render the table to list the flight and airline list.
  		3. Simple XHTML pages are created(index page provides links to other pages like list the flight details, list airline and CRUD operation page. 
  	2. List all the flight with details:
  		1. This page list down flights in a table with details like flight id, name, departure time, arrival time, origin and destination airport. 
  		2. In this page, there is also a filter where you can filter the flight by name, arrival time, departure time, origin and destination. A bean called CommomService.java is implemented to check the condition for this filter. 
  		3. Datatable is used to iterate over the list of flight and display in tabular format in a browser. 
  		4. JFS Ajax is used to render this display: 	<f:ajax listener="#{commonService.filter()}" execute="@form"
				render="display" />. 
		5. A simple navigation is implemented to return to index page by using: action="index?faces-redirect=true"
	3. List the airline
		1. A datatable is used to display the list of airline with ID and Name.
	4. CRUD Operation(Create, Update, Delete and List)
		1. A flight name is provided through the input text and the id is genereted randomly.
		2. For delete and Update methods, a dropdown (jsf selectonemenu) list is provided (which is flight name) to delete or to change the flight name of the airline. 
	5. A list is displayed in tabular format and changes when ever there is an operation. For example, if flight is updated it refreshes with new flight name.

[1. Screenshot of Index page](homepage.png)
[2. Screenshot of Flight details](Flight.png)
[3. Screenshot of Flight details using filter](filter.png)
[4. Screenshot of CRUD Operation](CRUD.png)
[5. Screenshot of list of airline](listairline.png)

	
