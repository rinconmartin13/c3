FROM openjdk:17
ADD target/c3.jar c3.jar
ENTRYPOINT ["java", "-jar","c3.jar"]
