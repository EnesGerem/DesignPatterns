# Design Patterns

## Introduction

## Design Principles

### Single Responsibility Principle (SRP)

***There should never be more than one reason for a class to change.***

It tells us that a class should have a functional togetherness and focus only one responsibility. Therefore, a class should only be changed for only one abstraction reasons.

In a way, single responsibility principle is an application of Dijkstra's Seperation of Concerns princible. According to Dijkstra, intelligent thinking can only be achieved by focusing an aspect of a subject one at a time.

Levels of SRP;
Package: Structures released together should be in the package.
Class: A class should abstract only one aspect and has the related data&logics.
Method: A method should do a reusable and unbreakable job that directly connected with the abstraction specified by the method's class.

Classes can get more complex in time, in that case, classes can be divided into parts to preserve single responsibility principle. For example, a service class' responsibilities can be seperated in helpers classes. Usually, a class should have methods at most between 15-20, after this interval, classes should be divided. Also, an aggregate class should not implement more than 3-5 interfaces.

### Open-Closed Principle (OCP)

***Software entities (classes, modules, functions etc.) should be open for extension, but closed for modification.***

Software systems always change in terms of features, users etc. These changes must be handled with extensions, not with modifications. In that sense, software modules should be closed for modification. New requirements on softwares should be handled by applying extension.

At developer level, source codes should not be modified. Existed codes should live as they were, developers should only add new codes to change.

Open for extension simply means seperation of modificable part and unmodificable part. Modificable part should be modified by overriding with extended classes, which provides reusability and maintainability for whole system. Therefore, cost and time spent in production get lower.

### Liskov Substitution Principle (LSP)

***Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it.***

A subclass should not change main aspects of its superclass. For examle, assuming a Rectangle super class has attributes of shortEdge and longEdge, so if a Square class extends the Rectangle class which is in real life not an illegal thing to say, Square class cannot be compatible with an API that used to communicate with the Rectangle class because square has no different edges. In this case, Square class changes the main aspects of its super class and it is not desirable.

It can be figured out by thinking about writing tests about super class. For above example, a rectangle's area can be tested by setting short and long edges which would be asserted wrong for square object because expected value would be different for square and rectangle.

```java
rectangle.setShortEdge(5);
rectangle.setLongEdge(10);
assert rectangle.getArea() == 5*10;
```

As it can be seen that expected area is 50, but for a square, since there is no short and long edges, expected area would be 25 or 100 and this situation leads bigger problems for clients.

Main purpose of LSP, designed program should be verified by users of the program. The most important aspect is the way of using the system by clients.

### Interface Segregation Principle (ISP)

***Clients should not be forced to depend upon interfaces that they do not use.***

ISP is a version of SRP that aims high togetherness and get rid of fat or polluted interfaces to get nicer and more focussed interfaces.

For example, an interface has 5 methods and 3 of them are used by a client, other 2 of them are used by another client. These kinds of interfaces are called fat interface and they should be divided into parts.

Anti-ISP status has 2 typical indicators:
1. Different clients call methods of same interfaces.
2. Subtypes of an interface have hard time to run some methods.

In these kinds of cases, interfaces should be divided into parts and subtypes should takeover the methods they need so that they can do their jobs easily.

To give another example, assuming a logger interface is designed to serve both logging a database and a file. If an operation does not need to log into database, the class of the operation should implement the the database writing methods as for example UnsupportedOperation. The solution for this example would be defining a Log interface that extended by DBLogger and FileLogger interfaces and in the future if there occurs a need of console logging feature, a ConsoleLogger interface can be added to the equation.


### Dependency Inversion Principle (DIP)

***High level modules should not depend upon low level modules. Both should depend upon abstractions. Abstractions should not depend upon details, details should depend upon abstractions.***


### Demeter Law

## Creational Design Patterns

### Factory Pattern

#### Factory Method

#### Abstract Factory Method

### Singleton Pattern

### Prototype Pattern

### Builder Pattern

### Object Pool Pattern

## Structural Design Patterns

### Adapter Pattern

### Bridge Pattern

### Composite Pattern

### Decorator Pattern

### Facade Pattern

### Flyweight Pattern

### Proxy Pattern

## Behavioral Design Patterns

### Command Pattern

### Interpreter Pattern

### Iterator Pattern

### Mediator Pattern

### Memento Pattern

### Observer Pattern

### State Pattern

### Strategy Pattern

### Template Pattern
