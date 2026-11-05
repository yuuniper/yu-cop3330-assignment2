# COP3330 Assignment 2: Programming Exercises 24-40

A set of small command-line Java programs written for **COP3330 (Object-Oriented Programming), Summer 2021, at UCF**. This is archived coursework, kept for reference and not maintained.

## What it is

Seventeen standalone exercises (numbered 24 through 40, matching the numbering in Brian Hogan's *Exercises for Programmers*). Each one is a short console program covering a basic topic: string handling, input validation, loops, arithmetic, collections, and file/record filtering. Examples include an anagram checker, a password strength checker, a multiplication table, a number guessing game, an employee list, and a password generator.

Each exercise lives in its own package, `oop.example.exNN.base`, with a `SolutionNN` class holding `main` and a JUnit test class under `src/test`. Some exercises also have a PlantUML design sketch (`.puml`).

## Tools

- Java 16 or newer (the POM targets 16; it also builds on newer JDKs, tested with 21)
- Maven
- JUnit 4 and JUnit 5 (jupiter-params), Hamcrest
- Guava (used by exercises 39 and 40)

## Build and test

```bash
mvn test
```

## Run an exercise

Compile, then run the `Solution` class for the exercise you want. Most programs read from standard input.

```bash
mvn -q compile
java -cp target/classes oop.example.ex24.base.Solution24
```

Exercises 39 and 40 need Guava on the classpath:

```bash
java -cp "target/classes:$(mvn -q dependency:build-classpath -Dmdep.outputFile=/dev/stdout)" oop.example.ex39.base.Solution39
```

On Windows, use `;` instead of `:` in the classpath.
