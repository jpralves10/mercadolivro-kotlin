FROM adoptopenjdk/openjdk11:alpine-jre

RUN apk update

RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

WORKDIR /

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]