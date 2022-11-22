# App build stage
FROM maven:3.8.6-openjdk-18 as BUILD
WORKDIR /home/app/src
COPY src /home/app/src
COPY pom.xml /home/app/
WORKDIR /home/app/
RUN mvn clean validate package -Dmaven.test.skip=true

# Packaging stage
FROM amazoncorretto:18.0.1
ARG JAR_FILE=/home/app/target/*.jar
COPY --from=BUILD ${JAR_FILE} spring-poc.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring-poc.jar"]