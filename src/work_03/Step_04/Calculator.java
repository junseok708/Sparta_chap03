package work_03.Step_04;

public class Calculator {
    private AbstractOperation abstractOperation;

    public Calculator(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }

    public void setAbstractOperation(AbstractOperation abstractOperation) {
        this.abstractOperation = abstractOperation;
    }


    double calculate(int firstNumber, int secondNumber) {
        double number = 0;
        number = abstractOperation.orperate(firstNumber, secondNumber);
        return number;
    }

}
