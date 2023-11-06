
This is the source code showing the tools use to build a CRUD application.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
    - [Installation](#installation)
    - [Configuration](#configuration)
- [Deployment](#deployment)
- [Usage & Testing](#usage--testing)
    - [Endpoints](#endpoints)


## Prerequisites

- Java 17 or higher
- Spring boot 3
- PostgreSQL 15
- Maven

## Getting Started

Get a copy of this repo by using the git clone command.

### Installation

1. Clone the repository:

   ```bash
   git clone UML_diagram.jpg

2. Build the project using Maven:
   ```bash
   mvn clean install

### Configuration
1. All required dependencies are added to the pom.xml file for successful building of the application.
2. The required database connection is also set up in the src/main/resources/application.properties file. You can set up your own database using:
    ```bash
    spring.datasource.url=jdbc:postgresql://dpg-ck2ofseru70s73913u70-a.oregon-postgres.render.com/home_kyyn
    spring.datasource.username=home
    spring.datasource.password=OydgYyk7ouCJ0pJTaxhGVelkmp1gEuI7
    spring.datasource.driver-class-name=org.postgresql.Driver
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
    spring.jpa.properties.hibernate.temp.use_jdbc_metadata_defaults=false
    spring.jpa.show-sql=true
    spring.jpa.hibernate.ddl-auto=update

## Deployment
This application was deployed on Render.

## Usage & Testing of Endpoints
Postman was used for testing of this application, which the collection was tested. Check the json file "Stage-two.postman_test_run.json" to see the results.
The published documentation of the expected requests and response can be found in this link: https://documenter.getpostman.com/view/27935491/2s9YC5xXVj

<b style="color:yellow">CREATE</b> a new user

# Example request:
```bash
curl --request POST 'http://localhost:8080/api' \
--data '{
"name": "Mark Essien"
}'
# Example response:
{
"id": 1,
"name": "Mark Essien"
}
```

<b style="color:green">GET</b> user by id
```bash
# Example request:
curl --request GET 'http://localhost:8080/api/22' \
--data ''

# Example response:
{
"id": 1,
"name": "Mark Essien"
}
```

<b style="color:blue">UPDATE</b> user by id
```bash
# Example request:
curl --request POST 'http://localhost:8080/api/22' \
--data '{
"name": "Bobo Joe"
}'

# Example response:
{
"id": 22,
"message": "Bobo Huge",
"timeStamp": "17:14:52.255204700"
}
```

<b style="color:red">DELETE</b> user by id
```bash
# Example request:
curl --request DELETE 'http://localhost:8080/api/22' \
--data ''

# Example response:
Deleted user successfully
```

##  API
Use
https://user-zqec.onrender.com
