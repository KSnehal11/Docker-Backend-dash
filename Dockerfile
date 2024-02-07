FROM openjdk:latest
WORKDIR usr/lib
EXPOSE 8095
ADD ./target/dashboard-0.0.1-SNAPSHOT.jar /usr/lib/dashboard-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","login-0.0.1-SNAPSHOT.jar"]
