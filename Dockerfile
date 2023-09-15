FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar crud.jar
ENTRYPOINT ["java","-jar","/crud.jar"]
EXPOSE 8080