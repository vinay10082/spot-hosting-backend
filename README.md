# spot-hosting-backend


docker run -p 8080:8080 -e SPRING_DATASOURCE_URL=jdbc:postgresql://host.docker.internal:5432/spothostingDB -e SPRING_DATASOURCE_USERNAME=postgres -e SPRING_DATASOURCE_PASSWORD=admin123 spot-hosting-docker-image

# To Do:

1. cache provider: REDIS