package fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // myContactList is a simple.puml list, can contain any objects
        // ArrayList can have any number of elements,
        // it is not mandatory to specify the size, like in case of arrays
        List myContactList = new ArrayList();
        // in order to add elements to a list we have to call functions
        myContactList.add("Mariah Carey");
        myContactList.add("Metallica");
        myContactList.add("Spiderman");
        myContactList.add(13);

        for(Object item : myContactList) {
            System.out.println("myContactList item: " + item);
        }

        // we can also define what kind of elements are going to be added to the list
        List<String> myStringContactList = new ArrayList<>();
        myStringContactList.add("Mariah Carey");

        // we can add to a list, result of other functions
        myStringContactList.add(myContactList.get(1).toString());

        myStringContactList.add("Spiderman");
        // myStringContactList.add(13); // this will not work, since 12 is a number

        for(String item : myStringContactList) {
            System.out.println("myStringContactList item: " + item);
        }
    }

}
