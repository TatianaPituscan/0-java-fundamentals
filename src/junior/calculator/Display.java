package junior.calculator;

public class Display {

    public static void showWelcomMessage() {
        System.out.println("Welcome to Basic Calculator");
        System.out.println("please follow the steps for get the calculation done");
        System.out.println("----------------------------------------------------");
    }

    public static void askFirstOperand() {
        // since println moves the cursor to the next line, we'll use just print()
        // this will give us a nice way to let message and value in same line
        System.out.print("Please provide first operand = ");
    }

    public static void askOperation() {
        System.out.printf("Please select operation: ");
    }

    public static void askSecondOperand() {
        System.out.print("Please provide second operand = ");
    }

    public static void showResult(int result) {
        System.out.println("-------------------------------------------");
        System.out.println("The result of the operation is = " + result);
    }

    public static void showBye() {
        System.out.println("Thanks for using Basic calculator, see you soon!");
    }
}
