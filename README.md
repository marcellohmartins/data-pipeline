# Database to Kafka with Java, Springboot and Gradle.

This repository serves as a portfolio showcasing my skills and experience in developing a Spring Boot Java application. The application is designed to extract data from a MySQL database, publish it to Apache Kafka, and includes unit tests for robustness.

## Technologies Used

- Spring Boot
- Gradle
- MySQL
- Apache Kafka
- Docker

## Getting Started

To run the application locally, please ensure you have the following prerequisites installed:

- Java Development Kit (JDK)
- Docker
- Docker Compose

Follow the steps below to set up and run the application:

1. Clone this repository to your local machine using the following command:
   git clone https://github.com/marcellohmartins/mysql-kafka

2. Navigate to the cloned repository:

`cd mysql-kafka`

3. Start the MySQL container using Docker Compose:

`docker-compose up -d`


4. Build and run the Spring Boot application using Gradle:

`./gradlew bootRun`

The application will start and connect to the MySQL container to retrieve data.

5. Verify that the data is being published to Kafka by checking the Kafka topic.

## Project Structure

The repository contains the following files and directories:

- `src/`: Contains the source code for the Spring Boot application.
- `build.gradle`: Defines the Gradle build configuration and dependencies.
- `docker-compose.yml`: Sets up the MySQL database container.
- `README.md`: Provides an overview of the repository and instructions for running the application.
- `test/`: Contains unit tests for the application.

## Unit Tests

The repository includes a suite of unit tests to ensure the correctness and robustness of the application. The tests cover different components and functionalities of the application, including data extraction from the database and data publishing to Kafka.

