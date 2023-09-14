# user-crud

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
