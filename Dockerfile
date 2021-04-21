FROM openjdk:8
LABEL maintainer=anshulsinghal
COPY target/spring-boot-mysql-0.0.1-SNAPSHOT.jar .
EXPOSE 5001
ENTRYPOINT ["java","-jar","spring-boot-mysql-0.0.1-SNAPSHOT.jar"]