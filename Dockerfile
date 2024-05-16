FROM openjdk:20
COPY target/MicroService1_1-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "prueba.jar"]