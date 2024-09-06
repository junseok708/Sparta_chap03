package work_03.Step_02;

public class Calculator {

    double calculate(String operator, int firstNumber, int secondNumber) {
        int number = 0;
        if (operator.equals("+")) {
            number = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            number = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            number = firstNumber - secondNumber;
        } else if (operator.equals("/")) {
            number = firstNumber - secondNumber;
        } else if (operator.equals("%")) {
            number = firstNumber % secondNumber;
        }
        return number;
    }

}
