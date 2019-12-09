# Spring Boot Example Projects

## Create a project
### Generate a project from spring initializr site

https://start.spring.io/

### Generate a project with command-line

```sh
curl https://start.spring.io/starter.tgz -d dependencies=web,data-jpa \
-d groupId=com.sejin \
-d artifactId=jpa \
-d language=java  \
-d name=spring-example
-d type=maven-project \
-d baseDir=spring-example | tar -xzvf -
```

### Add configuration to root pom

```xml
../../pom.xml

...
<modules>
...
  <module>spring/spring-example</module>
</modules>
...

```