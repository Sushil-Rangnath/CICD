FROM openjdk:8
EXPOSE 8081
ADD target/Spring-Docker.jar Spring-Docker.jar
ENTRYPOINT ["java","-jar","/Spring-Docker.jar"]