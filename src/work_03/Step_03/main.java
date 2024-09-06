package work_03.Step_03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = 0;

        String symbols = sc.nextLine();
        int firstNumber = sc.nextInt();
        sc.nextLine();
        int secondNumber = sc.nextInt();

        Calculator calculator = new Calculator(new AddOperation(), new SubstractOperation(),
               new MultiplyOperation(),new DivideOperation());

        number=calculator.calculate(symbols,firstNumber,secondNumber);

        System.out.println(number);
    }
}
