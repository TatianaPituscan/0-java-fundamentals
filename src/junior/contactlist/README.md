# Contact List

> Web version is not ready yet, but do not worry, we'll create it later and will update this article

The purpose of this application is to create a simple contact list application with all basic range of functions create, read, update and delete contacts, for both Console and Web environments. The main flow is: 

1. Run the application 
1. Console or Web 
1. Create contact 
1. List contact(s) 
1. Update contact 
1. Delete contact

> You can do your own implementation as long it meet the requirements form the main flow.

The videos will cover steps needed to accomplish this projects. Each video will cover one certains steps. The UML diagram showing the order of things can be found under `src/junior/contactlist`  

YouTube: 
1. [Diagram to classes](https://www.youtube.com/watch?v=Utoyp75fXJw&index=3&list=PLPkoWZmDIKwAMCtfB_PI1ffcXX1_Rzxai)
1. [Create + List](https://www.youtube.com/watch?v=RT6HHvqxm3M&list=PLPkoWZmDIKwAMCtfB_PI1ffcXX1_Rzxai&index=4)

Main topics are:
1. [UML ](https://lucidchart.com/pages/what-is-UML-unified-modeling-language)
    - **I** interface, **A** abstract class, **C** class
    - [simple empty arrow: Inheritance ](https://www.tutorialspoint.com/java/java_inheritance.htm)
    - [diamond arrow: Composition ](https://thoughtco.com/java-composition-definition-and-example-2034053)
1. [Interafaces and Classes ](https://docs.oracle.com/javase/tutorial/java/javaOO/)
1. [Inheritance ](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
1. [OOP ](https://docs.oracle.com/javase/tutorial/java/concepts/)
1. [POJO ](https://en.wikipedia.org/wiki/Plain_old_Java_object)
1. [SOLID ](https://dzone.com/articles/the-solid-principles-in-real-life)
1. [MVC ](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)
1. [Maven and packaging ](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
1. [JEE and containers ](http://stackoverflow.com/questions/7295096/what-exactly-is-java-ee)
1. [Definition of a java container](http://stackoverflow.com/questions/7151206/definition-of-a-java-container)

## Technical notes

We are using PlantUML to describe the applications:

To see the diagrams install:
1. [PlantUML plugin for Intellij Idea](https://plugins.jetbrains.com/plugin/7017-plantuml-integration)
1. [GraphViz](https://graphviz.gitlab.io/download/)

To get a global overview take a look at diagrams

1. [simple.puml](simple.puml)
1. [detailed.puml](detailed.puml)

Or you could use a online service like: [https://liveuml.com/](https://liveuml.com/). Where you can copy paste the content of the files.

## Feeling lucky ?

The current implementations is console (*terminal friendly*) version, 
if you want to extend it feel free to try a http web implementation using 
Java's native HttpServer: 
 - https://www.logicbig.com/tutorials/core-java-tutorial/http-server/http-server-basic.html

## NEXT

[README.md # NEXT](../../../README.md)