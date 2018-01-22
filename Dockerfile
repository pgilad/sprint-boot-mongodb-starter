FROM openjdk:9-slim AS BUILD_IMAGE

ENV APP_HOME=/root/dev/app/
WORKDIR $APP_HOME
RUN mkdir -p $APP_HOME/src/main/java
COPY build.gradle gradlew gradlew.bat $APP_HOME
COPY gradle $APP_HOME/gradle

# download dependencies
RUN ./gradlew --version
RUN ./gradlew build -x :bootRepackage -x test --continue
COPY . .
RUN ./gradlew build

FROM openjdk:9-slim
WORKDIR /root/
COPY --from=BUILD_IMAGE /root/dev/app/build/libs/gs-spring-boot-0.1.0.jar .
EXPOSE 8080
CMD ["java","-jar","gs-spring-boot-0.1.0.jar"]
