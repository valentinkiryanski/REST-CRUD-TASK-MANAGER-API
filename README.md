# 📝 Task Manager REST API

A full-featured RESTful API for managing tasks, built with **Java 17**, **Spring Boot**, and **MySQL**. This application supports full **CRUD operations**, **role-based access control**, custom **exception handling**, and **Swagger UI** for easy testing.

## 🚀 Features

- ✅ Create, Read, Update, and Delete tasks
- 🔐 Authentication and Role-based authorization (EMPLOYEE, MANAGER, ADMIN)
- ⚠️ Centralized Exception Handling with custom messages
- 🧾 MySQL database integration via Spring Data JPA
- 📜 API documentation using Swagger/OpenAPI
- 🔁 Input validation (optional)
- 🛠️ Built with Spring Boot 3.5

---


## 📦 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **MySQL**
- **Swagger / OpenAPI (springdoc-openapi)**
- **Maven**

---
🚀 How to Run the Spring Boot Task Manager App

✅ Prerequisites

Make sure you have the following installed:
- Java 17+
- Maven
- MySQL
- Postman (optional, for testing)
- Web browser (to use Swagger UI)

1. 📂 Clone the Project
git clone https://github.com/valentinkiryanski/REST-CRUD-TASK-MANAGER-API.git
cd REST-CRUD-TASK-MANAGER-API

2. 🛠️ Set Up the Database
Log in to MySQL and run the following SQL:

CREATE DATABASE task_manager;

USE task_manager;

CREATE TABLE tasks (
  id INT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(50) NOT NULL,
  due_date DATE DEFAULT CURRENT_DATE,
  is_completed BOOLEAN DEFAULT FALSE
);

INSERT INTO tasks
VALUES
(1,"Make lunch","2003-05-10",false)
(2,"Clean the car","2004-10-10",true),
(3,"Brush teeth","2003-05-10",false);

Make sure your MySQL username and password match what's in application.properties:

spring.datasource.username=springstudent
spring.datasource.password=springstudent

3. ⚙️ Build the Project
mvn clean install

4. ▶️ Run the Application
mvn spring-boot:run

5. 🌐 Access the Swagger UI
Open your browser and navigate to:
http://localhost:8080/swagger-ui/index.html

You’ll be prompted for credentials. Use one of the following:

Username | Password  | Role(s)
-------- | --------- | -----------------
susan    | susan123  | EMPLOYEE
alex     | alex123   | MANAGER
john     | john123   | MANAGER, ADMIN

🔐 Role-Based Access Summary

HTTP Method | Endpoint          | Role Required
------------|-------------------|----------------
GET         | /api/tasks        | EMPLOYEE+
GET         | /api/tasks/{id}   | EMPLOYEE+
POST        | /api/tasks        | MANAGER+
PUT         | /api/tasks        | MANAGER+
DELETE      | /api/tasks/{id}   | ADMIN only

---
## 📂 Project Structure

```bash
src/
├── main/
│   ├── java/com/rest_crud_api/task_manager/
│   │   ├── controller/
│   │   ├── entity/
│   │   ├── repo/
│   │   ├── exceptionhandler/
│   │   ├── security/
│   │   └── TaskManagerApplication.java
│   └── resources/
│       ├── application.properties
└── test/
