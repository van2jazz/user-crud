# user-crud
This documentation provides details about the User Management API, including its endpoints, 
request/response formats, sample usage, limitations, and setup instructions.

# Prerequisites
Before you begin, ensure you have met the following requirements:
•	Java Development Kit (JDK) 8 or later
•	Apache Maven
•	A compatible database (e.g., MySQL, PostgreSQL)
•	Spring Boot


# Installation
To set up the User Management API, follow these steps:
1.	Clone the repository:
	https://github.com/van2jazz/user-crud.git
    cd  user-management-api
2.	Build the project using Maven
mvn clean install

# Configuration
Configuration for the API can be found in the src/main/resources/application.properties file. 

# API Endpoints
The following API endpoints are available:

•	GET /api/all: Get a list of all users.

•	POST /api/save: Create a new user.

•	GET /api/{id}: Get a user by ID.

•	PUT /api/update: Update an existing user.

•	DELETE /api/{id}: Delete a user by ID.





# The User API offers the following endpoints:
1.	Get All Users

Endpoint: GET /api/all

Description: Retrieve a list of all users.

Request Format: N/A (No request body)

Response Format:
	HTTP Status Code: 200 OK
	Body:
	
 	 {
    	   "userId": 1,
    	   "name": "Jelly Millar"
 	 },
   
 	 {
    	   "userId": 2,
	   "name": "John MAyer"
  	 }

3.	Create a New User
•	Endpoint: POST /api/save

•	Description: Create a new user.

•	Request Format:
o	Content-Type: application/json

o	Body:

	{
 	 "name": "Mark Essien"
	}

•	Response Format:
     	 HTTP Status Code: 201 Created


3.	Get User by ID
•	Endpoint: GET /api/{id}
•	Description: Retrieve a user by their ID.
•	Response Format:
o	HTTP Status Code: 200 OK
Body:
{
  "userId": 2,
  "name": "Jane Smith"
}

4.	Update an Existing User

•	Endpoint: PUT /api/update
•	Description: Update an existing user.
•	Request Format:
o	Content-Type: application/json
Body:
{
  "userId": 3,
  "name": "Updated Name"
}

Response Format:
         HTTP Status Code: 200 OK
5.	Delete User by ID
Endpoint: DELETE /api/{id}
Description: Delete a user by their ID.
Response Format:
HTTP Status Code: 200 OK

Limitations and Assumptions
•	The API assumes a single-user entity with attributes userId and name.
•	There is no authentication or authorization mechanism implemented yet.
•	Error handling for validation and exceptional cases is minimal.


