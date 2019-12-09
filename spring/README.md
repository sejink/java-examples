# Spring Boot Example Projects

## Create a project
### Generate a project with spring initializr

https://start.spring.io/

### Generate a project with command-line

```sh
curl https://start.spring.io/starter.tgz -d dependencies=web,data-jpa \
-d groupId=com.sejin \
-d artifactId=jpa \
-d language=java  \
-d name=spring-data-jpa-example
-d type=maven-project \
-d baseDir=spring-data-jpa-example | tar -xzvf -
```
