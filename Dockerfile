# Build Stage
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -X

# Package Stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /target/miniproject-1.0-SNAPSHOT.jar /miniproject-1.0-SNAPSHOT.jar
EXPOSE 8082
CMD ["java", "-jar", "miniproject-1.0-SNAPSHOT.jar"]
