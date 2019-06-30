# Classes

A class is an extensible program-code-template for creating objects,
providing initial values for state (member variables) and implementations of behavior (member functions or methods)

> In java one file can contain multiple classes
> Classes are usually kept in folders, called: packages

## Anatomy

> In this part we'll explore just a list of the "organs" since the complicated cases could be difficult to digest at this stage

1. visibility (optional)
1. the keyword class
1. the name
1. what other class it extends (optional)
     - by default is Object
     - one class max
1. what interfaces it implements (optional)
     - class can implement any amount of interfaces
1. block with code the part inside the curly braces { },
     - variables which live for the whole duration of the class or instance
     - static initializing blocks
     - initializing blocks
     - constructor
     - functions
     - inner classes

[Access Control](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

[Class variables](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

[Initializing Fields](https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html)

Variables - /fundamentals/variables

```java
class MyExtraClass
{
  // we can declare variables and assign values
  User mainUser = new User("John");
  int userId = 23;
  
  // we can only declare variables without valu value
  User loggedUser;
  Connection dbConnection;
  
  /** 
   * we CAN NOT isntantiate anonymous variables directly in class, 
   * BUT, we can do it only inside functions or static blocks 
   * new User("John");// anonymous instance, no variables here!
   *
   * btw, this is a multiline comment :)
   */
  static {
    new User("John"); // anonymous instance
  }
  
  {
    // we can use as well non static block
    // use those with care, think thrice before doing so
    // it is not bad, nor good - the queestion is - do you need to do it ? 
  }
  
  // we CAN NOT call functions here, neither write statements like [for, while, if, ...]
  // we can only declare things!
  // if you want to simply put some random code, you could use the constructor
  
  public MyExtraClass() {
    // this is a special function that has same name as the class
    // it is called: constructor
    // because it is called automatically by Java when new instance of this class is created
    // NOTICE: there's no return type declared, aka: public SomeType MyExtraClass() {...
  }
}

/** Other examples */ 

// implements one interface
private class OtherParty implements BabyLife { }

// extends one object and implements one interface
public class Party extends Object implements CrazyLife { }

// extends one object and implements multiple interfaces
public class Party extends Object implements CrazyLife, ScienceLife { }

// Multiple extension (inheritance) is not possible : class Party extends Object, Object2 
```

## NEXT

[07. Simple Calculator](../../junior/calculator/)
