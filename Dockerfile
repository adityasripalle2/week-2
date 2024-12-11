FROM openjdk
WORKDIR  /sam
COPY  . /sam
RUN javac Test.java
CMD ["java","Test"]

# Use OpenJDK base image
FROM openjdk:17-alpine
# Set working directory
WORKDIR /app
# Copy all files to the working directory
COPY . /app
# Compile the Java application
RUN javac Test.java
# Expose port 8080 for the application
EXPOSE 8080
# Run the Java application
CMD ["java", "Test"]

