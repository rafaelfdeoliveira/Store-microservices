FROM amazoncorretto:11-alpine

COPY target/shop-api-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8084