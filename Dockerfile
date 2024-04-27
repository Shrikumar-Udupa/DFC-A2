FROM openjdk:17
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} java-app.jar
ENTRYPOINT ["java","-jar","/java-app.jar"]
EXPOSE 8080