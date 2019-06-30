package junior.calculator;

import java.util.Scanner;

public class Input {

    // we create a variable scanner and assign to it a new instance of scanner
    // at class level, since we are going to use it in all functions
    Scanner scanner = new Scanner(System.in);

    public int getOperand1() {

        // in java we have a Scanner class that gives us possibility to read
        // user's input

        int result = scanner.nextInt();
        return result;
    }


    // as you see, here we use variable with same name: result
    // it is not same variables, because it is defined in different function (place)
    public String getOperation() {
        String result = scanner.next();
        return result;
    }

    public int getOperand2() {
        int result = scanner.nextInt();
        return result;
    }
}
