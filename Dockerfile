FROM openjdk:8-jdk-alpine AS BUILD_IMAGE

ENV APP_HOME=/root/dev/app/
WORKDIR $APP_HOME
RUN mkdir -p $APP_HOME/src/main/java

COPY build.gradle gradlew gradlew.bat $APP_HOME
COPY gradle $APP_HOME/gradle

# download dependencies
RUN ./gradlew build -x :bootRepackage -x test --continue

COPY src ./src
RUN ./gradlew build

FROM openjdk:8-jdk-alpine
WORKDIR /root/
COPY --from=BUILD_IMAGE /root/dev/app/build/libs/gs-spring-boot-0.1.0.jar .
EXPOSE 8080
CMD ["java", "-jar", "gs-spring-boot-0.1.0.jar"]
