FROM eclipse-temurin:17
LABEL maintainer="joshuasimon656@gmail.com"

WORKDIR /app

COPY target/SpringCRUD-0.0.1-SNAPSHOT.jar /app/SpringCRUD.jar

ENTRYPOINT ["java", "-jar", "SpringCRUD.jar"]
