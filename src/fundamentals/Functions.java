package fundamentals;

public class Functions {

    public static void main(String[] args) {
        FunctionsObject myFuncs = new FunctionsObject();
        myFuncs.setRabbitsNumber(12);

        myFuncs.doSomeMagic("David Blane");
        myFuncs.doSomeMagic("David Blane", myFuncs.getRabbitsNumber());

        // in order to call this function, you have to make it public
        // myFuncs.gimmeCoins(); // so in order to call it you have to change visibility

        myFuncs.callAndSubCall();
    }

}
