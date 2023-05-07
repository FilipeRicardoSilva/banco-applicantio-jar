    FROM openjdk:17
    ARG JAR_FILE=target/banco-application-1.0-SNAPSHOT-jar-with-dependencies.jar
    COPY ${JAR_FILE} app.jar
    ENTRYPOINT ["java","-jar","/app.jar"]
    
