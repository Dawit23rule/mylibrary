# Spring Boot Homework Assignment

![preview](https://raw.githubusercontent.com/Dawit23rule/mylibrary/refs/heads/main/static/ezgif-7cc7e974da402f.gif)

## Purpose

This web application is a simple Spring Boot application that manages authors and their books. The goal of the project is to practice using Spring Boot, including Spring Data JPA, Thymeleaf, form validation, and running the application on a custom port.

## Features

- **Add New Author and Book**: A web page with a form to add new authors and books.
- **List of All Books**: A page that displays a list of all books with their authors.
- **Book Detail Page**: A details page for a single book, including a link to the author's page.
- **Edit or Delete Book**: Ability to edit or delete a book.
- **All Authors Page**: A page that displays all authors.
- **Author Detail Page**: Each author page shows the author’s details and a list of books written by that author.
- **Edit or Delete Author**: Ability to edit or delete an author.

## Technologies Used

- **Spring Boot**: For building the web application.
- **Spring Data JPA**: For interacting with the database and handling CRUD operations.
- **Thymeleaf**: For rendering the views and templates.
- **H2 Database**: An in-memory database for development and testing.
- **Spring Boot Validation**: For validating form inputs.

## Running the Application

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Dawit23rule/mylibrary
   cd mylibrary
   ```
   
2. **Build the Application**
   </br>If you are using Gradle, you can build the application by running:
   ```bash
   ./gradlew build
   ```
3. **Run the Application**
   </br>Start the application using the following command:
   ```bash
   ./gradlew bootRun
   ```
   The application will be available at http://localhost:9090.
4.  **Database Configuration**
   </br>The application uses an H2 in-memory database. You can access the H2 console at:
    - URL: http://localhost:9090/h2-console
    - JDBC URL: jdbc:h2:mem:testdb 
    - Username: sa 
    - Password: (leave blank)

## Project Structure
```declarative
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.mylibrary
│   │   │       ├── controller
│   │   │       │   ├── AuthorController.java
│   │   │       │   ├── BookController.java
│   │   │       ├── model
│   │   │       │   ├── Author.java
│   │   │       │   └── Book.java
│   │   │       ├── repository
│   │   │       │   ├── AuthorRepository.java
│   │   │       │   └── BookRepository.java
│   │   │       └── MylibraryApplication.java
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   └── templates
│   │   │       ├── authors
│   │   │       │   ├── form.html
│   │   │       │   ├── list.html
│   │   │       │   └── view.html
│   │   │       └── books
│   │   │           ├── form.html
│   │   │           ├── list.html
│   │   │           └── view.html
└── build.gradle

```

### Controller Classes
- `AuthorController.java`: Manages routes related to authors, including creating, updating, deleting, and displaying authors.
- `BookController.java`: Manages routes related to books, including creating, updating, deleting, and displaying books.

### Model Classes
- `Author.java`: Represents an author in the system.
- `Book.java`: Represents a book, with a relationship to an author.

### Repository Classes
- `AuthorRepository.java`: Interface for managing Author entities in the database.
- `BookRepository.java`: Interface for managing Book entities in the database.

### Main Application Class
- `MylibraryApplication.java`: The main entry point of the application, containing the `@SpringBootApplication` annotation to run the application.

### Thymeleaf Templates
- `authors/form.html`: A form for creating or editing an author. 
- `authors/list.html`: Displays the list of all authors. 
- `authors/view.html`: Displays the details of a single author along with their books. 
- `books/form.html`: A form for creating or editing a book. 
- `books/list.html`: Displays the list of all books. 
- `books/view.html`: Displays the details of a single book, including a link to the author’s page.

### Port Configuration
- By default, Spring Boot runs on port 8080. However, I have changed it to 9090. If you prefer the default port, you can change it back by modifying the `application.properties` file.
```properties
server.port=9090
```

## Author

> This project was completed by: </br>
> <strong>Dawit Gebresellase (Student Id: 159209) </strong>
