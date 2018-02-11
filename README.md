# Spring Boot MongoDB Starter
> A starter kit for Spring Boot with MongoDB Backend

See MVP of:
1. Spring Boot
2. MongoDB
3. Docker multi-stage build (112MB)
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

## Development with [MongoDB Atlas](https://www.mongodb.com/cloud)

Using MongoDB Atlas is easy. Simply get your connection string (for Mongo 3.4 or under),
then paste it in your `application.properties` file:

```ini
spring.data.mongodb.uri=mongodb://pgilad:password@cluster0-shard.mongodb.net:27017,cluster0-shard-00.mongodb.net:27017,cluster0-shard-01.mongodb.net:27017/test?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin
```

And Spring Boot will connect to your MongoDB Atlas.

**Note**: You will need to encode uri the password if it contains special characters (such as `:` and `@`).

## License

MIT
