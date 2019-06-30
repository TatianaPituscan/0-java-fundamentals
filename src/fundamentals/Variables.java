package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Variables {

    public static void main(String[] args) {
        // when we declare a variable of type Object,
        // we can assign to it any value,
        // a primitive or reference to any instance (a object)
        // e.g.: "text", 32, new String(), new ArrayList(), new HTTPConnectionIpml(), etc.
        Object dummyVar = 12;
        dummyVar = new int[67];
        dummyVar = "Text";

        dummyVar = new ArrayList();
        // but, because dummyVar is of type Object,
        // no functions from ArrayList are going to be displayed
        // yet, we can do something by CASTing
        ((ArrayList) dummyVar).add("12");
        ((ArrayList) dummyVar).add(34);

        /*
        * in order to see the functions in auto-complete within IDE
        * and tell java compiler what behaviour (functions) are going to be used on this object, we have to explicitly "CAST"
        * casting is saying to compiler: trust me, I know what I'm doing and I can guarantee you that this Object at this line is actually an "ArrayList" (or any other type of choice)
        * @see http://stackoverflow.com/a/5289493/1107450
        */
        System.out.println("dummyVar item 0: " + ((ArrayList) dummyVar).get(0));
        System.out.println("dummyVar item 1: " + ((ArrayList) dummyVar).get(1));

        // if we'll try to call function without casting,
        // java compiler and Intellij Idea (or any other IDE)
        // will complain about wrong types
        // dummyVar.add(123);

        // to avoid typing problems, we can set type to our variables
        String firstName = "John";

        // we can assign a value to variable, or we can call a function
        // and result of that function will be assigned to our variable
        String replaceResult = firstName.replace("J", "Vag");
        System.out.println("replaceResult: " + replaceResult);

        // we can declare a variable without assigning a value
        String myVariable;

        myVariable = firstName;
        myVariable = replaceResult;

        // so essentially, is called VARIABLE - because it's value can be different

        // variables marked as final, can have assigned only one value
        // during lifetime of the application
        // and you can do it on declaration, or in other places which can be called only once!
        final String aConstant = "Const value, like Pi: 3,1415..";
        // aConstant = firstName; // this will not work, since aConstant already have a value

        String var1 = "var1's value";
        String var2 = var1; // we assign to a variable value of another
        System.out.println("initial var1: " + var1);
        System.out.println("initial var2: " + var2);

        var2 = null; // then we assign null
        System.out.println("after null var1: " + var1);
        System.out.println("after null var2: " + var2);
        // and we see that var1 was not modified!
        // the idea is: we assign value to a variable
        // and we do not change the value it self using assign operation!
        // assign operation is: = (equals sign)

        List l1 = new ArrayList();
        List l2 = l1;
        l2 = null;
        System.out.println("l1: " + l1); // l1 is still ok :)
    }

}
