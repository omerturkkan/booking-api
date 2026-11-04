# booking-api

Appointment booking REST API built with Spring Boot, JPA and PostgreSQL.

> Work in progress: the project is being built step by step.

## Tech stack

- Java 21
- Spring Boot 4.1 (Web MVC, Data JPA, Validation)
- PostgreSQL, run with Docker Compose
- Maven (wrapper included)
- JUnit 5 and AssertJ for tests

## Prerequisites

- JDK 21
- Docker Desktop, running

PostgreSQL does not need to be installed. When the application starts, Spring Boot starts the database
container defined in `compose.yaml`.

## Run the application

```bash
./mvnw spring-boot:run
```

On Windows, use `.\mvnw.cmd spring-boot:run`. The API listens on `http://localhost:8080`.

## Run the tests

```bash
./mvnw test
```

Docker must be running, because the tests use the same PostgreSQL container.

## API

### Create an appointment

`POST /appointments`

Request:

```json
{
  "customerName": "Ayse",
  "startTime": "2026-11-05T11:00:00"
}
```

Response:

```json
{
  "customerName": "Ayse",
  "id": 102,
  "startTime": "2026-11-05T11:00:00"
}
```

## Roadmap

- [x] Create appointments
- [ ] Reject appointments for a time that is already booked
- [ ] Request validation and clear error responses
- [ ] List, update and cancel appointments
- [ ] Database migrations with Flyway
- [ ] Integration tests with Testcontainers
- [ ] Authentication
