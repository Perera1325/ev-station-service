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


Day 5 — WSO2 API Gateway Integration

The Booking Microservice is now exposed through WSO2 API Manager acting as an API Gateway. Instead of clients calling the microservice directly, requests are routed through the WSO2 Gateway with token-based authentication.

Architecture:

Client → WSO2 API Gateway → Booking Service → Station Service → Database

Key Features Implemented:

* API publishing using WSO2 API Manager
* Secure access using Bearer token authentication
* Subscription and token generation via Developer Portal
* Gateway routing to backend microservice
* Enterprise-level API management architecture

Gateway Endpoint Example:

https://localhost:8243/booking/1.0.0/bookings

Authorization Header:

Authorization: Bearer <ACCESS_TOKEN>

This demonstrates real-world API management and microservice gateway integration.


Author

Vinod Perera
GitHub: https://github.com/Perera1325
