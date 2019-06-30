package fundamentals;

/**
 * a class is a high level container for variables and functions
 * "there is no java life outside of a class!!"
 * Class have same name as the file that holds it!
 */
public class Classes {

    // I'm a PUBLIC STATIC variable, and I belong to this class
    // I do not belong to it's instances! we'll discuss the details in next course - Java Junior
    public static String wow = "Like, wOW!!!";

    // I'm PRIVATE STATIC variable, and I belong to this class to
    private static String shh = "Shh, quiet...";

    // I'm a PUBLIC STATIC function and I belong to this class!
    public static void aStaticFunction() {
        // code ..
        // and I can call private function from within the class
        // they are like little brothers to me, I'm playing with them while at home :))
        hideTreasure("Flint", "Captain");
        shh.toString(); // as well I can call other static variables
    }

    // I'm a PRIVATE STATIC function and I belong to this class as well
    private static void hideTreasure(String param1, String param2) {
        // do the hiding here..
        // aStaticFunction(); // I can call the public static functions to, but if you'll un comment this line, you'll get inifinite recursion :)
    }

    // NOTE
    // the other variables and function we have created in previous lessons
    // we can create them in any class to! but without keyword - static - they belong to the instances of the class
    // and we have this already in previous lessons!
    // to create a instance of a class you should use keyword - new -
    // e.g. List list = new ArrayList();
}

// I'm a inner class! and outside of this file I'm called via class: Classes
// the one that we just created on upper
// e.g. new Classes.InnerDaemon();
// I CANNOT be public or private!
// I'm a fully qualified class, I can have variables, functions, etc.
class InnerDaemon {

    String name;

    public String getName() {
        return name;
    }
}

// I'm just another inner class, so we can be as much as you want
// but you should want as less as you can :)
class JustAnotherInnerThing {
    // you've got it
}

// remember those files ? so yes! they are all - class - es ;)