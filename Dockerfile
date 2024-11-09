FROM alpine/java:21-jdk

EXPOSE 8080

COPY build/libs/authorization-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]