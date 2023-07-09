FROM gradle:7.2-jdk11 as builder

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src

RUN gradle build --no-daemon

FROM openjdk:11-jre-slim

RUN mkdir /app
WORKDIR /app
COPY --from=builder /home/gradle/src/build/libs/*.jar /app/
CMD ["java", "-Xmx1G", "-jar", "springboot-playground-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
