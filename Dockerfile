FROM eclipse-temurin:25

LABEL mentainer = "vinay06102001@gmail.com"

WORKDIR /app

COPY target/SpotHosting-0.0.1-SNAPSHOT.jar /app/spot-hosting.jar

ENTRYPOINT ["java", "-jar", "spot-hosting.jar"]