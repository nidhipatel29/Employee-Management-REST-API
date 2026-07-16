# Employee Management REST API

## Overview

Employee Management REST API is a backend application built using Spring Boot. It provides RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on employee records. The project follows a layered architecture using Controller, Service, and DAO components, with Hibernate and JPA for database interaction and MySQL as the relational database.

## Features

* Create a new employee
* Retrieve all employees
* Retrieve an employee by ID
* Update employee information
* Delete an employee
* RESTful API design
* Layered architecture (Controller → Service → DAO)
* Database persistence using Hibernate and JPA

## Technologies Used

* Java
* Spring Boot
* Spring Web (REST API)
* Spring Data / JPA
* Hibernate
* MySQL
* Maven

## Project Structure

```text
src
├── controller
├── service
├── dao
├── entity
└── EmployeeCrudApplication
```

## REST API Endpoints

| Method | Endpoint        | Description                 |
| ------ | --------------- | --------------------------- |
| GET    | /employees      | Retrieve all employees      |
| GET    | /employees/{id} | Retrieve an employee by ID  |
| POST   | /employees      | Create a new employee       |
| PUT    | /employees      | Update an existing employee |
| DELETE | /employees/{id} | Delete an employee          |

## Architecture

```text
Client
   │
HTTP Request
   ▼
Controller
   │
   ▼
Service
   │
   ▼
DAO
   │
   ▼
Hibernate / JPA
   │
   ▼
MySQL Database
```

## Learning Objectives

This project demonstrates:

* Building REST APIs with Spring Boot
* Layered application architecture
* Dependency Injection
* CRUD operations using JPA and Hibernate
* Database integration with MySQL
* Request handling using REST controllers

## Future Improvements

* Exception Handling
* Validation using Bean Validation
* Pagination and Sorting
* Swagger/OpenAPI Documentation
* Unit Testing with JUnit and Mockito
* Spring Security with JWT Authentication


