### My First REST App

**Project Overview:**
My First REST App is a Spring Boot application designed to demonstrate the creation of a RESTful web service. The application is built using Java and Maven, and it leverages several Spring Boot starters and dependencies to provide a robust and scalable REST API.

**Key Features:**
- **Spring Boot Integration:** Utilizes Spring Boot to simplify the setup and development of the application.
- **JPA for Data Persistence:** Uses Spring Data JPA to interact with a PostgreSQL database.
- **Lombok for Boilerplate Code Reduction:** Employs Lombok to reduce boilerplate code in the application.
- **OpenAPI Documentation:** Integrates Springdoc OpenAPI to generate API documentation.

**Project Structure:**
- **`src/main/java/com/example/my_first_rest_app`**: Contains the main application class and other Java source files.
    - **`MyFirstRestAppApplication.java`**: The entry point of the Spring Boot application.
- **`src/main/java/com/example/my_first_rest_app/Repositories`**: Contains repository interfaces for data access.
    - **`PlayersRepository.java`**: Repository interface for managing `Players` entities.
- **`pom.xml`**: Maven configuration file that manages project dependencies and build configuration.

**Dependencies:**
- **Spring Boot Starter Data JPA**: Provides integration with JPA for data persistence.
- **PostgreSQL**: Database driver for PostgreSQL.
- **Lombok**: Reduces boilerplate code by generating getters, setters, and other methods.
- **Spring Boot Starter Test**: Provides testing support.
- **Spring Boot Starter Web**: Enables the creation of web applications, including RESTful services.
- **Springdoc OpenAPI Starter WebMVC UI**: Generates OpenAPI documentation for the REST API.

**Main Application Class (`MyFirstRestAppApplication.java`):**
This class contains the `main` method, which is the entry point of the Spring Boot application. It uses `SpringApplication.run` to launch the application.

**Repository Interface (`PlayersRepository.java`):**
This interface extends `JpaRepository` and provides methods to perform CRUD operations on `Players` entities. It includes a custom method `findByDiscordId` to find players by their Discord ID.

**Maven Configuration (`pom.xml`):**
The `pom.xml` file defines the project's dependencies, including Spring Boot starters, PostgreSQL driver, Lombok, and Springdoc OpenAPI. It also configures the Maven build process, including the use of the Maven Compiler Plugin and the Spring Boot Maven Plugin.

**Usage:**
To run the application, execute the `main` method in `MyFirstRestAppApplication.java`. The application will start a web server and expose the REST API endpoints defined in the project. You can interact with the API using tools like Postman or cURL, and view the API documentation generated by Springdoc OpenAPI.

**Conclusion:**
My First REST App is a simple yet powerful demonstration of how to build a RESTful web service using Spring Boot. It showcases the use of various Spring Boot starters and dependencies to create a scalable and maintainable application.