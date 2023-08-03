# Use an appropriate base image with Java (e.g., OpenJDK)
FROM openjdk:8-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR (replace "your-artifact.jar" with your actual JAR file name)
COPY . .

# Expose the port on which your Java application listens (if applicable)
EXPOSE 8080

# Command to run your Java application
CMD ["java", "-jar", "app.jar"]
