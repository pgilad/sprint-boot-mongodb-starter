# Spring Boot Demo
> An attempt to create a basic spring boot demo with MongoDB backend

See MVP of:
1. Spring Boot
2. MongoDB
3. Docker multi-stage build (135MB)
4. Swagger 2
5. Lombok

## Use

### Dockerize all the things™

```sh
# Using docker-compose
$ docker-compose up -d

# Simply Docker
$ docker build -t spring-boot-demo .
$ docker run --rm spring-boot-demo
```

### See available apis

```sh
$ open http://localhost:8080/swagger-ui.html
```

## Development

### Dev Requirements

- Java 8+
- Gradle 4+
- MongoDB localhost server

### Run with gradle

```sh
$ ./gradlew bootRun
```

### Build with gradle

```sh
$ ./gradlew build
```

### Run as jar

```sh
$ java -jar build/libs/gs-spring-boot-0.1.0.jar
```

## License
