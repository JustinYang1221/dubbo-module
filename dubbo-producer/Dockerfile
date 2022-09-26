#ARG DUBBO_PORT

FROM maven:3-openjdk-11 as build
WORKDIR /build
COPY . .
RUN mvn package

FROM openjdk:11 AS final
WORKDIR /app
COPY --from=build /build/target/*.jar producer.jar
#ENTRYPOINT ["java","-jar","producer.jar"]
#ENTRYPOINT ["java","-DdubboPort=$DUBBO_PORT","-jar","producer.jar"]
ENTRYPOINT java -DdubboPort=$DUBBO_PORT -DzookeeperIp=$ZOOKEEPER_IP -jar producer.jar
#ENTRYPOINT ["java","-Dspring.profiles.active=${ENV}","-jar","producer.jar"]
