FROM openjdk:13.0.2
ADD target/docker-rest.jar docker-rest.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "docker-rest.jar"]