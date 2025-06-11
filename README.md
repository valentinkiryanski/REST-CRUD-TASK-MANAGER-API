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
