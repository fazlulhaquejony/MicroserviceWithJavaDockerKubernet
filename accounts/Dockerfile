#start with a base image containing Java runtime
FROM openjdk:17-slim as build
#Information around who maintain the image
MAINTAINER fjtechsolutions.com
#Add the applicant's jar to the container
COPY target/accounts-3.0.1.jar   accounts-3.0.1.jar
#execute the application
ENTRYPOINT ["java","-jar","accounts-3.0.1.jar"]


