FROM openjdk:17-slim-buster

COPY build/libs/MsInquiry-0.0.1-SNAPSHOT.jar .

ENTRYPOINT java -jar MsInquiry-0.0.1-SNAPSHOT.jar