package work_03.Step_04;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number =0;

        String symbols = sc.nextLine();
        int firstNumber = sc.nextInt();
        sc.nextLine();
        int secondNumber = sc.nextInt();

        Calculator calculator = new Calculator(new AddOperation());

        if (symbols.equals("+")) {
            calculator.setAbstractOperation(new AddOperation());
            number = calculator.calculate(firstNumber, secondNumber);
            System.out.println(number);
        } else if (symbols.equals("-")) {
            calculator.setAbstractOperation(new SubstractOperation());
            number = calculator.calculate(firstNumber, secondNumber);
            System.out.println(number);
        } else if (symbols.equals("*")) {
            calculator.setAbstractOperation(new MultiplyOperation());
            number = calculator.calculate(firstNumber, secondNumber);
            System.out.println(number);
        } else if (symbols.equals("/")) {
            calculator.setAbstractOperation(new DivideOperation());
            number = calculator.calculate(firstNumber, secondNumber);
            System.out.println(number);
        }
    }
}
