package junior.calculator;

public class CalculationUnit {

    public int calculate(int operand1, String operation, int operand2)
            throws Exception {
        int result;

        // find what should we do depending on the selected operation
        switch (operation) {
            case "+":
//                do the math
                    result = operand1 + operand2;
                break;
            case "-":
//                do the math
                    result = operand1 - operand2;
                break;
            case "*":
//                do the math
                    result = operand1 * operand2;
                break;
            case "/":
//                do the math
                    result = operand1 / operand2;
                break;
            default:
                // in case of wrong operation, we are going to THROW a exception
                // instead of RETURNING a result
                throw new Exception("Unsupported operation provided!");
        }

        // if everything is fine, return the result!
        return result;
    }

}
