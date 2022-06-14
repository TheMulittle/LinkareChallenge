# Linkare TI | Exercise

## Building the project with gradle

### First things first

First of all, you need to have [JDK 17+](https://www.oracle.com/java/technologies/downloads/#jdk17-windows) installed and need to ensure that your JAVA_HOME environment variable is properly set

Secondly, you either need to have [Gradle](https://gradle.org/install/) installed or download [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) through the following command in bash:

```bash
./gradlew
```

This command will download the [Gradle Wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) which, in turn, will permit execution of Gradle commands

### Building and running the application

In order to build the application the following commands can be used:

```bash
./gradlew build

or

gradle build
```

The application executable will appear under `./app/build/libs` with name `app.jar`. The application can be run with the following command

```bash
java -jar app.jar
```

Should you want to run the unit tests, the following commands can be used

```bash
./gradlew test

or

gradle test
```
