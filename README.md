Smart EV Charging Management Platform — Station Microservice

This project is part of a microservices-based Smart EV Charging Management System developed using Spring Boot and MySQL. The Station Service manages EV charging stations, including location, availability, and power capacity.

Project Overview

The Station Service is responsible for:

* Creating charging stations
* Retrieving station information
* Managing station availability
* Storing data in MySQL database

This microservice will integrate with other services such as User Service, Booking Service, and WSO2 API Manager in future stages.

Technology Stack

* Java
* Spring Boot
* Spring Data JPA (Hibernate)
* MySQL
* Maven
* REST API

Project Structure

src/main/java/com/ev/station_service

* controller — REST controllers
* service — Business logic
* repository — Database layer
* entity — JPA entities
* StationServiceApplication.java — Main application

API Endpoints

Create Station

POST /stations

Example Request

{
"name": "Colombo Fast Charge",
"location": "Colombo",
"powerCapacity": 120.5,
"available": true
}

Get All Stations

GET /stations

Database Configuration

Database name: ev_stations

spring.datasource.url=jdbc:mysql://localhost:3306/ev_stations
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

How to Run

Using Maven Wrapper:

./mvnw spring-boot:run

Application runs on:

http://localhost:8082

Future Improvements

* Integration with User Service
* Booking Management
* WSO2 API Gateway integration
* Docker deployment

Author

Vinod Perera
GitHub: https://github.com/Perera1325
