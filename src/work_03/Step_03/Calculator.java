package work_03.Step_03;

public class Calculator {
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation,
                      MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }



    double calculate(String operator, int firstNumber, int secondNumber) {
        double number = 0;
        if (operator.equals("+")) {
            number= addOperation.operate(firstNumber,secondNumber);
        } else if (operator.equals("-")) {
            number= substractOperation.operate(firstNumber,secondNumber);
        } else if (operator.equals("*")) {
            number= multiplyOperation.operate(firstNumber,secondNumber);
        } else if (operator.equals("/")) {
            number= divideOperation.operate(firstNumber,secondNumber);
        }
        return number;
    }

}
