# java-examples

[![Build Status](https://travis-ci.com/sejink/java-examples.svg?branch=master)](https://travis-ci.com/sejink/java-examples)

## Create a project (on Bash)

### Generate with maven plugin

```sh
./mvnw archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart
```

### Install maven wrapper

```sh
cd mavenproject
../mvnw -N io.takari:maven:wrapper
```

### Add .gitignore file

```sh
git config --global alias.ignore '!gi() { curl -L -s https://www.gitignore.io/api/$@ ;}; gi' //for bash
git ignore java,maven,linux,windows,eclipse,intellij+all >> .gitignore
```
