# Тестовое задание для T1 Consulting

### REST-сервис, вычисляющий частоту встречи символов по заданной строке

#### Принимает HTTP POST запросы на http://localhost:8080/stringStatistics с заданной строкой в HTTP Body. Строка не может быть null, размер возможной строки зависит от размера HTTP Body, символы в строке могут быть любыми. Возвращаемое значение - JSON с частотой встречи каждого символа

### Требования

Для того, чтобы собрать и запустить приложение необходимы:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Gradle 8.4](https://maven.apache.org)

### Запуск приложения локально

Есть несколько способов запустить данное приложениe на локальной машине. Первый: выполнить метод `main` в классе `com/example/testtaskitconsulting/TestTaskItConsultingApplication` в IDE.
Второй: [Spring Boot Gradle plugin](https://docs.spring.io/spring-boot/docs/current/gradle-plugin/reference/htmlsingle/) следующим образом:

```shell
./gradlew bootRun
```