FROM openjdk:8-jdk-alpine

COPY target/*.jar MavenTest1-1.0.0.jar

ENTRYPOINT ["java","-jar","/MavenTest1-1.0.0.jar"]