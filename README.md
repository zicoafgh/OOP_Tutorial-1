# Object-Oriented Programming Fundamentals in Java

## Assignment Information

| Item | Details |
|---|---|
| Assignment | Assignment 1 - Individual |
| Student Name | Zineb Afqir |
| Student ID | 202505010522 |
| Course | 202605F1923 / BIT1123 - Object Oriented Programming |
| Repository | [OOP_Tutorial-1](https://github.com/zicoafgh/OOP_Tutorial-1) |

## Course Description

This Repository will include the practical work of Java completed in BIT1123 Object Oriented Programming. The tutorials cover a first program in Java, classes and objects, encapsulation, inheritance, polymorphism, abstraction, collections, file handling, exception handling, and a graphical User Interface using Swing. The exercises put together both the basic syntax of Java and the use of object-oriented design principles.

## Repository Structure

```text
OOP_Tutorial-1/
|-- README.md
|-- .gitignore
|-- week_1/
|-- week_2/
|-- week_3-4/
|-- week_5/
|-- week_6/
|-- week_7/
|-- week_8-9/
`-- week_10/
```

The repository uses one consistent week based naming convention. Combined tutorial folders are used for Weeks 3-4 and Weeks 8-9, as permitted by the assignment brief.

## Tutorial Summary

### Week 1 - Java Fundamentals

The `HelloWorld` program introduces Java program structure, the `main` method, packages, console output.

### Week 2 - Classes and Objects

A `Student` class models a student's name, age, and GPA. A constructor initializes each object, while methods display information and represent behaviors such as studying and taking an exam. This tutorial establishes the difference between a class and an object.

### Weeks 3-4 - Inheritance and Polymorphism

The `Person` superclass provides shared data and an `introduce()` method. `Student` and `Lecturer` extend `Person` and override the method. The `Main` class stores different subclass objects in `Person` references, demonstrating inheritance, method overriding, and runtime polymorphism.

### Week 5 - Encapsulation

The `student` class keeps student ID, name, CGPA, and programme fields private. Getter and setter methods provide controlled access to the object's state. The accompanying documentation explains why private fields protect data and how accessors support validation and maintainability.

### Week 6 - Inheritance and Constructor Chaining

The `Lecturer` subclass inherits common ID and name fields from `Employee`. Its constructor calls `super()` before initializing subject and department information, demonstrating code reuse, protected access, and constructor chaining.

### Week 7 - Abstraction and Method Overriding

The abstract `Appliances` class defines shared power behavior and an abstract `operate()` contract. `Microwave` and `Television` provide their own implementations, demonstrating abstraction, inheritance, and polymorphic method calls.

### Weeks 8-9 - Collections, File Handling, and Exceptions

A console task manager collects user input in an `ArrayList`. The `Save` utility writes tasks to `task.txt`, reads them back with buffered streams, and handles possible `IOException` errors through `try-catch` and try-with-resources.

### Week 10 - Java Swing GUI

The Programming Quiz Battle uses Swing components such as `JFrame`, `JLabel`, and `JButton`. It implements `ActionListener` to respond to button clicks and separates quiz data and answer checking into a `Questions` class.

## Object-Oriented Concepts Demonstrated

- **Classes and objects:** reusable models are instantiated in driver programs.
- **Encapsulation:** private fields are accessed through getters and setters.
- **Inheritance:** subclasses reuse and extend superclass state and behavior.
- **Polymorphism:** superclass references invoke overridden subclass methods.
- **Abstraction:** an abstract class defines common operations and a required contract.
- **Event-driven programming:** GUI behavior is triggered through action events.

## Technologies Used

- Java Development Kit (JDK)
- Java Standard Library
- Java Collections Framework
- Java I/O API
- Java Swing and AWT event handling
- Git and GitHub
- Java IDE, such as VS Code

## How to Run the Projects

1. Install JDK 8 or newer and confirm that `java` and `javac` are available.
2. Clone or download this repository.
3. Open the repository in a Java IDE.
4. Treat the repository root as the source root, or place each tutorial's files in folders matching its declared package.
5. Run the `main` class for the selected tutorial. Week 10 starts from `QuizBattleGUI.java`.

## Reflection Summary

These tutorials show a clear progression from writing a simple console program to structuring related classes, protecting data, reusing behavior through inheritance, and responding to events in a graphical interface. The most valuable lesson was that object-oriented programming is not only about syntax: it is about assigning responsibilities to classes, controlling access to data, and choosing structures that make software easier to extend. File handling and GUI development also highlighted the need to anticipate errors and understand how user actions affect program state.

## Author

Zineb Afqir  
Student ID: 202505010522
