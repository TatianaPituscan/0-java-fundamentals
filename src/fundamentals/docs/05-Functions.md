# Functions

Functions are "self contained" modules of code that accomplish a specific task. Functions usually "take in" data, process it, and "return" a result

Functions are lines of code that defines a complete behavior, for example: sleeping is a function of humans, a behavior: human.sleep();

[Access control](http://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

[Class variables (applicable to functions as well)](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)

[Functions - code example](../Functions.java)

 - [FunctionsObject - code example](../FunctionsObject.java)
 - Note: `FunctionsObject` is just a name of a class, no more than that.

[Functions - video example](https://www.youtube.com/watch?v=_kbJhpKNBa0&t=338s&index=4&list=PLPkoWZmDIKwCvNeBpZMejx8gQhglUxw-w)

> In the following examples you'll have classes with different names, this should not scare you, you'll learn more about classes right after.

## Anatomy

From top to the bottom you'll find the "organs" of a function

1. visibility
1. static or not
1. return type, any function always return something, in case of void they “return nothing”
    - when return type is void then return statment is not mandatory
1. name, the actual name of the function so we can call it later
1. list of parameters the part inside the paranthesis
    - the parameters become variables inside the block with code
1. block with code, the part inside the curly braces { }
    - a block of code contains:
    - variables which live only when this function is called/executed
    - statements like for, while, if, etc.
    - call of other functions
1. return statement

```java
public class FunctionsExample {
    
    // a static function can call another static one
    // a static function cannot call directly a non-static one
    // a non-static function can call directly a static one
    
    public static void main(String[] args) {
        String result;
        
        System.out.println("Trying with id = 0");
        result = getUsernameById(0);
        
        System.out.println("result = " + result);
        
        System.out.println("Trying with id = 23");
        result = getUsernameById(23);
        
        System.out.println("result = " + result);
    }
    
    public static String getUsernameById ( int id) {
       String username;
    
       if(id == 0) {
          username = "john";
       } else {
          username = "jack";
       } 

       System.out.println("The selected username is: " + username);

       return username;
    }
    
}
```

### More examples of various ways to write the functions

[github-gist](https://gist.github.com/rodislav/fd77d5f3b89178fe2d7f4b87200d0287)

```java
public class MrJavaBean {
    
    // a static function cannot call directly a non-static one
    // --> but! a static function can call directly a non-static function via instance of a object
    
    public static void main(String[] args) {
        MrJavaBean javaBean = new MrJavaBean();
        javaBean.behaveCrazy("Jack");
    }
    
    // this is an example of a function with one parameter
    public void behaveCrazy(String name)
    {
       System.out.println("I'm " + name + " crazy!!!!");
    }
    
    // this is an example of a function with multiple parameters
    public void behaveCrazy(String name, int age)
    {
       System.out.println("I'm " + name + " crazy!!!! I'm " + age + " years old");
    }
    
    // here is an example with more code inside
    public void makeNoize()
    {
    // get the set from list of guests present at the party
       Set<Map.Entry<String, MrJavaBean>> entries = guestList.entrySet();
    
    // iterate within this list, in other words: go to each guest and dome some action on it
       for(Map.Entry<String, MrJavaBean> entry: entries)
       {
     // define a variable which will be the selected/current guest
           MrJavaBean javaBean = entry.getValue();
            
          // we check if the guest name is equals to John
           if(javaBean.getName().equals("John"))
           {
            // if so, we ask him to behave crazy
            // we invoke/call on him, his function (behavior) behaveCrazy()
               javaBean.behaveCrazy();
           }
          // else, if this is Harry, we call other function on the guest: behaveCool()
           else if(javaBean.getName().equals("Harry"))
           {
               javaBean.behaveCool();
           }
       }
    }
}
```

## NEXT

[06. Classes](06-Classes.md)
