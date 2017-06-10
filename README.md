# WAA_AIRLINE
# EXPOSE OF APPLICATION SERVICES AS REST WEB SERVICES
# Airline Service
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
  
