FROM openjdk:11

WORKDIR /app

COPY src /app/src

RUN curl -o junit-4.13.2.jar https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
RUN curl -o hamcrest-core-1.3.jar https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

RUN javac -d classes src/main/java/org/example/Calculator.java

RUN javac -cp classes:junit-4.13.2.jar:hamcrest-core-1.3.jar -d classes src/test/java/CalculatorTest.java

CMD ["java", "-cp", "classes:junit-4.13.2.jar:hamcrest-core-1.3.jar", "org.junit.runner.JUnitCore", "CalculatorTest"]
