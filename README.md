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

***Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory method lets a class defer instantiation to subclasses.***

For example, assuming a company's employee management system has an object for HR and an object for employee. HR adds new employee according to employee's types with if-else statements as below.

```java
public void addNewEmployee(int no, String name, int year, String department, String type, String departmentManaged,
			double bonus) {
		Employee employee = null;
		switch (type) {
		case "Employee":
			employee = new Employee(no, name, year, department, type);
			employees.add(employee);
			break;
			
		case "Manager":
			employee = new Employee(no, name, year, department, type, departmentManaged);
			employees.add(employee);
			break;
			
		case "Director":
			employee = new Employee(no, name, year, department, type, departmentManaged, bonus);
			employees.add(employee);
			break;
		}
	}
```

In the future, if employee's business logic gets complex, addNewEmployee method would become an if-else hell.

Factory method solves the problem that where to create objects by abstracting the creations of objects and defining creations in factory methods rather than in client codes. Factory method is responsible for creation of objects with interfaces and these operations happen in subclasses. Each subclass creates a different objects.

Instead of above structure, creation of objects can be handled by an interface called Factory with a single method of create(), and the implementation classes of EmployeeFactory, ManagerFactory and DirectorFactory.

```java
public interface Factory {
    Employee create();
}
```

But still, create method has no parameters and this can cause some problems for some system. Even tough passing parameters instead of collecting them in the method when possible is a very bad practice, sometimes it can be must to pass parameters. There is trade-off here, fewer parameters passed, more the factory method can be benefit.

The main goal of factory method is creating just one object. By this way, if-else hell can be removed from the equation. So, creating a class for factory, not an interface, that creates all kinds of objects related to job conflicts the principles SRP and OCP. Because this means handling more than one task in one place and opening for modification.


### Abstract Factory Pattern

***Provide an interface for creating families of related of dependent objects without specifying their concrete classes.***

Abstract factory is used for creating a group of objects instead of just one. Factory method abstracts only one object, abstract factory more than one. In that sense, abstract factory has more than one factory method.

The group of objects must be related and dependent with each other. A family of related product objects is designed to be used together, and this constraint must be enforced.

For example, for a windowing system, a family of objects could be Button, Label, List, Scrollbar etc.

There are some constraints while using abstract factory, such as if different kinds of objects are needed to create by different platforms, abstract factory interfaces must be divided. For example, if there are two different university with different kinds of features such as one of them has virtual class but the other does not, these universities' abstract factory interfaces must be divided. Similar problem can occur with different parameters with same objects and again it can be solved by dividing the interfaces.


### Singleton Pattern

### Prototype Pattern

### Builder Pattern

### Object Pool Pattern

## Structural Design Patterns

### Adapter Pattern

### Bridge Pattern

### Composite Pattern

### Decorator Pattern

***Attact additional responsible to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.***

Often times, new responsibilities are given to objects instead of whole class and inheritence is used to give these responsibilities. Main problem of this approach, inheritence has a compile-time structure. Each inheritence requires a new recompilation. So that, changing code & recompiling code and the number of subclasses becomes a big problem.

**Favor object composition over class inheritance.**

Object composition is a runtime structure. Inheritance is static, composition is dynamic. 

Assuming there is a toast maker and adds different ingredients to toasts according to clients' wishes. So, instead of creating every ingredients' combinations, a Toastable interface can be created and an abstract class of Topping implements this interface to add each ingredient on top of the current toast.

This method is like a pipeline and simply adding ingredients at anytime to current state of the toast without effecting previous ingredients.

Decorator pattern often requires passing the same type of object to an abstract class's constructor. So that, previously added items are visible to currently to be added item and the current item adds itself following to previously added items.

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

***Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.***

From time to time it is desirable to be aware of changes in the state of some objects. Querying for these objects periodically is a way of achieving it. However, this approach requires unnecessary operation in the system and causes uncertain delays.

Observer pattern provides a subscription solution that notifies listeners of the objects. Observable, subscribed object, can be observed by observer, listener, by receiving event notifications. Therefore, on observables there is an interface that allows subscription, and on observers there is an interface that provides receiving event notifications. This pattern is also known as Publisher-Subscriber, Producer-Consumer or Event-Notification.

### State Pattern

### Strategy Pattern

***Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independent from clients that use it.***

Often times, in software development there are more than one way to resolve an issue. Business logic of software gets bigger and these solutions are sometimes already defined algorithms or sometimes basicly different methods. For example, there could be more than one way of validating a data and these validations should not be handled with if-else statements. This solution is never suitable for long run, ignores future changes which conflicts with SRP and OCP.

To solve these problems, putting different algorithms abstracted from client in a way of interchangeable. In this way, algorithms would be seperated from each other so they will not be dependent on each other and they will be abstracted. Strategy pattern's solution constructing an interface that implemented by sibling classes. Each sibling does a different algorithm and a context object in the program decides which sibling to use. Therefore, new strategies can be added to system easily.

If there is more than one way of resolve an issue, strategy pattern should be used and an abstraction of algorithms should be provided to system.

### Template Pattern
