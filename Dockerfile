FROM openjdk:17-jdk-slim
EXPOSE 8081
ADD target/spring-docker.jar spring-docker.jar
ENTRYPOINT ["java","-jar","/spring-docker.jar"]