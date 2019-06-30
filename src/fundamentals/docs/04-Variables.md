# Variables

Variables are used to store reference to data, which will be manipulated in a computer program.
The only exception are primitive variables, they are holding the data itself.

[Java Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)

[Variables - code example](../Variables.java)

[Variables - video example](https://www.youtube.com/watch?v=1Ao2pZCpnCw&t=7s&index=3&list=PLPkoWZmDIKwCvNeBpZMejx8gQhglUxw-w)

[Visibility and Access Control](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

[Static a.k.a. Class variables](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

[A good explanation for Variables, for Ruby but the principle works everywhere](https://launchschool.com/books/ruby/read/variables)

> Since every `.java` file has to contain at least one class, we'll use the name `Main` for the sake of simplicity

```java
public class Main {
    public static void main(String[] args) {
        new User("John");// anonymous instance, no variables here!
        int userId = 23;
        
        /* 
         * User -> object
         * loggedUser -> name of the variable
         * Miley -> instance
         */
        User loggedUser = new User("Miley");
        Connection dbConnection = new Connection();
        
        int myInt = 0; // create myInt variable
        System.out.println("myInt = " + myInt);
        
        myInt = 123; // assign new value to myInt variable
        System.out.println("myInt = " + myInt);
        
        //------------ same here
        String myString = "some text here, even with spaces";
        System.out.println("myString = " + myString);
        
        myString = "some other text here";
        System.out.println("myString = " + myString);
        //------------
        
        // create variable and assign null as a value
        String myOtherString = null; 
        System.out.println("myOtherString = " + myOtherString);
        
        /* 
        create variable partyService and assign to it reference to a 
        new instance of a PartyService class
        see ? we can have same name, yet,
        we use UPPER-CASE for first character in the word, when they 
        are put together in one name for the class
        and use lower-case for first character of the variable name to 
        distinguish them
        https://en.wikipedia.org/wiki/Camel_case
        http://www.oracle.com/technetwork/java/codeconventions-135099.html
        */
        PartyService partyService = new PartyService();
        // check what is the unique id of this variable
        System.out.println("partyService = " + System.identityHashCode(partyService));
        
        partyService = new PartyService();
        /*
        after assigning new instance
        check if the unique id is different, because we assigned to this variable reference
        to another instance of the PartyService class
        */
        System.out.println("partyService = " + System.identityHashCode(partyService));
        
        // this type of variables is called: final, it cannot be changed
        // in java same thing is used for constants, same thing as in math class: Pi 3,1415...
        final String CONST_STRING = "whatever";
    }
}
```

## NEXT

[05. Functions](05-Functions.md)
