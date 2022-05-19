FROM maven:3.8.5-jdk-11-slim
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

ENTRYPOINT ["java","-jar","/home/app/target/shop-validator-1.0-SNAPSHOT.jar"]

EXPOSE 8089