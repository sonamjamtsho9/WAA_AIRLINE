# WAA_AIRLINE
# EXPOSE OF APPLICATION SERVICES AS REST WEB SERVICES
  1. Airline Service
  	
  	i: Create
  		a. POST method is used to create a new airline by passing JSON as raw input as part of the body message
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airline/create
  		c. Response (interface) is used to display the response message
  	ii. Delete
  		a. DELETE method is used to delete a record. JSON format is passed on as a raw input as part of the body message
  		b. URL Path:  http://localhost:8080/airlinesWebApp/rs/airline/delete
  		c. Response (interface) is used to display the response message
  	iii. Update 
  		a. PUT Method is used to update the record. JSON format is passed. 
  		b. URL Path:  http://localhost:8080/airlinesWebApp/rs/airline/update
  		c. Response (interface) is used to display the response message 
  	iv. Get flight id and name in JSON format by passing flight name is URL Parameter (Find one)
  		a. GET method is used to retrieve the details
  		b. URL Path (@Path("{fname}"): http://localhost:8080/airlinesWebApp/rs/airline/{fname}
  		c. Response (interface) is used to display the response message
  	v. Get a flight name by pass the ID as URL Param
  		a. GET method is used to retrieve the information
  		b.  URL Path: http://localhost:8080/airlinesWebApp/rs/airline/{id}
  		c. Response (interface) is used to display the response message
  	vi. List all the flights
  		a. GET method is used to retrieve the information
  		b. URL Path: http://localhost:8080/airlinesWebApp/rs/airline/listall
  	vii. List the flight by passing flight name as URL parameter
  		a. GET method is used to retrieve the information
  		b.  URL Path: http://localhost:8080/airlinesWebApp/rs/airline/flight/{name}
  		c. Response (interface) is used to display the response message
  	
  2. Airplane Service
  3. Airport Service
  4. Flight Service
