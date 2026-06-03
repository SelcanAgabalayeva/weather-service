# Weather Service API

## Overview

Weather Service API is a backend service developed for a weather dashboard application. The API provides city-based weather information including current weather conditions, weekly forecast, and hourly forecast data.

---

## Technologies

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* ModelMapper
* Lombok
* SpringDoc OpenAPI (Swagger)

---

## Installation

### Clone Repository

git clone https://github.com/SelcanAgabalayeva/weather-service.git

### Enter Project

cd weather-service

### Create Environment File

Create a .env file in the project root.

Required keys:

DB_URL

DB_USERNAME

DB_PASSWORD

### Install Dependencies

mvn clean install

### Run Application

mvn spring-boot:run

Application runs on:

http://localhost:8080

---

## Environment Variables

Required variables:

DB_URL

DB_USERNAME

DB_PASSWORD

---

## Database Setup

1. Create PostgreSQL database.
2. Update environment variables.
3. Start application.
4. Hibernate will create/update tables automatically.

---

## API Endpoints

### Get Weather By City

Method:

GET

URL:

/api/weather?city=Dhaka

Example Request:

GET http://localhost:8080/api/weather?city=Dhaka

Example Response:

{
"success": true,
"message": "OK",
"data": {
"city": {},
"current": {},
"weeklyForecast": [],
"hourly": []
}
}

---

## Swagger Documentation

Swagger UI:

http://localhost:8080/docs

OpenAPI JSON:

http://localhost:8080/api-docs

---

## Author

Name: Selcan Agabalayeva

GitHub:
https://github.com/SelcanAgabalayeva

LinkedIn:
(Add your LinkedIn URL)
