package junior.calculator;

public class App {

//    let's create a application that behaves like a real one
//    let's see what parts do we have in real app
//    1. the app itself (App.java)
//    2. display of the result or messages
//    3. the input or the keypad
//    4. the calculation unit, that does the calculation
//    we are going to create a console app, which looks different, but behaves
//    exactly like a normal one

    static Input input = new Input();

    public static void main(String[] args) throws Exception {
        // we have as well the display, let's use it here
        // since the functions are static, we can call the directly
        // without creating a instance!
        Display.showWelcomMessage();

        // let's see what is the first step in real life calculator
        // 1st one is to ask for first operand!
        // this function does not exist, but we can create it!
        Display.askFirstOperand();

        // next we have to wait for user's input!
        // so we need to give a way to do it
        // let's create the input

        int operand1 = input.getOperand1();

        // next step is to ask for operation

        Display.askOperation();

        String operation = input.getOperation();

        Display.askSecondOperand();

        int operand2 = input.getOperand2();

        // now we need to calculate the result and display it
        // let's create the calculation unit

        CalculationUnit calculationUnit = new CalculationUnit();

        // since the function could throw an exception, we have to do something about it
        // we have to explicitly declare that we are expecting one at application level
        // or catch it here, for now we'll declare it at this App's level
        int result = calculationUnit.calculate(operand1, operation, operand2);

        Display.showResult(result);

        Display.showBye();
    }

}
