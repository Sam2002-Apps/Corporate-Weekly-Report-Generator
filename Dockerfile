# Use a lightweight Java image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the source code into the container
COPY ./src /app/src

# Create a generic output folder
RUN mkdir -p /app/bin

# Compile the Java code
RUN javac -d /app/bin /app/src/*.java

# Run the Main class
CMD ["java", "-cp", "/app/bin", "Main"]