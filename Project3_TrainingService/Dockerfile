FROM openjdk:8-jdk-alpine
ADD target/*.jar training-service.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "training-service.jar"]
