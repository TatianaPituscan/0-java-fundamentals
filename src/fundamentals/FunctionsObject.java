package fundamentals;

public class FunctionsObject {

    private int rabbitsNumber;

    // the constructor is the function with the name of the class
    // it is called by the java virtual machine
    // when new instance is created
    public FunctionsObject() {
        System.out.println("I'm the function called by default");
        System.out.println("when new instance of \"me\" is created");
        System.out.println("I'm the constructor of " + getClass().getName());

        // we can call any function from within any function
        // this is how we call the function,
        // we write the name and add parenthesis
        // if there is a case, we should pass as well parameters
        hello();

        System.out.println("I have " + gimmeCoins() + " coins");
    }

    /*
    I'm a public function, you can call me from anywhere
    the functions are not called in automatic way (but the constructor!)
    somebody should to call them
    @see https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
    */
    // function with no parameters
    public void hello() {
        System.out.println("Hello all :)");
    }

    // function with one parameter
    public void doSomeMagic(String magicianName) {
        System.out.println("do the magic mr. " + magicianName);
    }

    // function with more parameters
    // here we see example of OVERLOADING, same function name but different amount and/or types of parameters
    public void doSomeMagic(String magicianName, int numberOfRabbits) {
        System.out.println("do the magic mr. " + magicianName + " with " + numberOfRabbits + " rabbits!");
    }

    // a private function can be called only from within the parent class!!
    // @see https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
    private int gimmeCoins() {
        return 345;
    }

    // function considered as getter
    // usually it is public
    public int getRabbitsNumber(){
        return rabbitsNumber;
    }

    public void setRabbitsNumber(int nr) {
        rabbitsNumber = nr;
        /*
        * as well it is quite common to name the parameter with same name as the variable (field/attribute)
         * e.g. setRabbitsNumber(int rabbitsNumber)
         * in this case to set the internal variable you have to use keyword: this
         * e.g. this.rabbitsNumber = rabbitsNumber;
        */
    }

    // functions can call other functions from same class
    // or from variables who are in this class
    // as well static functions
    // any function as well can have it's own variables,
    // which are destroyed when the function is executed
    public void callAndSubCall() {
       hello();
       int coins = gimmeCoins(); // we can call as well the private functions
       doSomeMagic("Rocky the SubCall", getRabbitsNumber());
       doSomeMagic("Coins", coins);

    }
}
