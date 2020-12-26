# Simple App #

## This is a simple java application ready to run with Docker.

1 - Create image

docker build -t <image-name> .

2 - Docker run

docker run -p 8080:8080 <image-name>

### Once the application is running, you can test it calling the following endpoint:

GET: http://localhost:8080/rest/v1/home

Response: Simple App - Home is responding !!!

