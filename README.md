# Spring Boot Demo
An attempt to create a basic spring boot demo with MongoDB backend

## Requirements

- Java 8+
- Gradle 4+
- MongoDB localhost server

## Use Docker

```bash
$ docker build -t spring-boot-demo .
$ docker run --rm spring-boot-demo
```

## Run

```bash
$ ./gradlew bootRun
```

## Build

```bash
$ ./gradlew build
```

## Run

```bash
$ java -jar build/libs/gs-spring-boot-0.1.0.jar
```

## License

MIT