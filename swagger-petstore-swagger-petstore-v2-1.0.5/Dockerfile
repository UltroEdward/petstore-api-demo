FROM maven:3.8.2-openjdk-8 as build

WORKDIR /src
COPY . /src
RUN mvn clean package

FROM openjdk:8-jre

WORKDIR /petstore
COPY --from=build /src/target/lib/jetty-runner* /petstore/jetty-runner.jar
COPY --from=build /src/run.sh /petstore/
COPY --from=build /src/target/swagger-petstore-v2-1.0.5 /petstore/webapp

RUN apt-get update

EXPOSE 8080
CMD ["bash", "/petstore/run.sh"]
