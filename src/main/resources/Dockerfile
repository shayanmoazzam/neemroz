# Use a base image with JDK installed
FROM openjdk:17-jre-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/neemroz-0.0.1-SNAPSHOT.jar"

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
