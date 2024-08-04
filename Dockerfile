FROM openjdk:17
COPY ./target/SpringBootRestAPIWithSpringData-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","SpringBootRestAPIWithSpringData-0.0.1-SNAPSHOT.jar"]