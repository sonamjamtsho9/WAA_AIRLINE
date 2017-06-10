# WAA_AIRLINE
# EXPOSE OF APPLICATION SERVICES AS REST WEB SERVICES
  1. Airline Service
  	1. Create
  		1. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		2. URL Path: http://localhost:8080/airlinesWebApp/rs/airline/create
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
  	
  2. Airplane Service
 	i: Create
  		a. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/create
  		c. Response (interface) is used to display the response message
  	ii. Delete
  		a. DELETE method is used to delete a record. JSON format is passed on as a raw input as part of the body message
  		b. URL Path:  http://localhost:8080/airlinesWebApp/rs/airplane/delete
  		c. Response (interface) is used to display the response message
 	iii. Update 
  		a. PUT Method is used to update the record. JSON format is passed. 
  		b. URL Path:  http://localhost:8080/airlinesWebApp/rs/airplane/update
  		c. Response (interface) is used to display the response message 
  	iv. Find one
  		a. GET method is used to retrieve the details
  		b. URL Path (@Path("findone/{id}), http://localhost:8080/airlinesWebApp/rs/airplane/findone{id}
  		c. Response (interface) is used to display the response message
  	v. Find by Serial Number
  		a. GET method is used to retrieve the information
  		b.  URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/serial/{sn}
  		c. Response (interface) is used to display the response message
  	vi. List all the flights
  		a. GET method is used to retrieve the information
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/flight/{sn}
  	vii. List by Model
  		a. GET method is used to retrieve the information
  		b.  URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/model/{modelno}
  	vi. List all
  		a. GET method is used to retrieve the information
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airplane/listall
  		
  3. Airport Service
  i: Create
  		a. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/create
  		c. Response (interface) is used to display the response message
  	ii. Delete
  		a. DELETE method is used to delete a record. JSON format is passed on as a raw input as part of the body message
  		b. URL Path:  http://localhost:8080/airlinesWebApp/rs/airport/delete
  		c. Response (interface) is used to display the response message
 	iii. Update 
  		a. PUT Method is used to update the record. JSON format is passed. 
  		b. URL Path:  http://localhost:8080/airlinesWebApp/rs/airport/update
  		c. Response (interface) is used to display the response message 
  	iv. Find one
  		a. GET method is used to retrieve the details
  		b. URL Path (@Path("find/{id}), http://localhost:8080/airlinesWebApp/rs/airport/find{id}
  		c. Response (interface) is used to display the response message
  	v. Find by AirportCode
  		a. GET method is used to retrieve the information
  		b.  URL Path: http://localhost:8080/airlinesWebApp/rs/airport/airportcode/{airportcode}
  		c. Response (interface) is used to display the response message
  	vi. Find by Arrival
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/Arrival/{acode}
  	vii. Find by Departure
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/Departure/{dcode}
  	viii. Find by City
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/City/{cname}
  	ix. Find by Country
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/Country/{name}
  	x. Find by Name
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/ByName/{bname}
  	xi. List all
  		a. GET method is used to retrieve the information
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airport/listall
  
  4. Flight Service
   i: Create
  		a. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/create
  		c. Response (interface) is used to display the response message
  	ii. Delete
  		a. DELETE method is used to delete a record. JSON format is passed on as a raw input as part of the body message
  		b. URL Path:  http://localhost:8080/airlinesWebApp/rs/Flight/delete
  		c. Response (interface) is used to display the response message
 	iii. Update 
  		a. PUT Method is used to update the record. JSON format is passed. 
  		b. URL Path:  http://localhost:8080/airlinesWebApp/rs/Flight/update
  		c. Response (interface) is used to display the response message 
  	iv. Find one
  		a. GET method is used to retrieve the details
  		b. URL Path (@Path("find/{id}), http://localhost:8080/airlinesWebApp/rs/Flight/findFlight/{id}
  		c. Response (interface) is used to display the response message
  	v. Find by Flight number
  		a. GET method is used to retrieve the information
  		b.  URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/airportcode/ByNumber/{flightnr}
  	vi. Find by Airline
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/ByAirline/{airid}
  	vii. Find by Origin
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/ByOrigin/{origid}
  	viii. Find by Destination
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/ByDestination/{desid}
  	ix. Find by Arrival 
  		a. GET method is used to retrieve the information (list)
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/ByArrival/{arrid}
  	x. List all
  		a. GET method is used to retrieve the information
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/Flight/listall
  
