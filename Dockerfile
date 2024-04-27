FROM openjdk:17
COPY build/libs/*.jar /java-app/java-app.jar
WORKDIR /java-app
EXPOSE 8080
ENTRYPOINT ["java","-jar","java-app.jar"]