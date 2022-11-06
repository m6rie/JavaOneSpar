package Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("\nType which operator would you like to use: '+', '-', '*', or '/'? ");

        System.out.println(
                "+---------------------+\n" +
                "|      Calculator     |\n" +
                "+---------------------+\n" +
                "| C | | % | |   | | + |\n" +
                "+---+-+---+-+---+-+---+\n" +
                "| 7 | | 8 | | 9 | | / |\n" +
                "+---+-+---+-+---+-+---+\n" +
                "| 4 | | 5 | | 6 | | X |\n" +
                "+---+-+---+-+---+-+---+\n" +
                "| 1 | | 2 | | 3 | | - |\n" +
                "+---------+-+---+-+---+\n" +
                "|    0    | | . | | = |\n" +
                "+---------------------+\n" +
                "|   Press Q to exit   |\n" +
                "+---------------------+");

        Scanner scanner = new Scanner(System.in);
        String operator = (scanner.next()).toUpperCase();

        while (!operator.equals("Q")) {
            System.out.println("First number: ");
            Scanner addNum1 = new Scanner(System.in);
            int number1 = addNum1.nextInt();
            System.out.println("Second number: ");
            Scanner addNum2 = new Scanner(System.in);
            int number2 = addNum2.nextInt();

            if (operator.equals("+")) {
                System.out.println(calc.add(number1, number2));
            } else if (operator.equals("-")) {
                System.out.println(calc.subtraction(number1, number2));
            } else if (operator.equals("*")) {
                System.out.println(calc.multiply(number1, number2));
            } else if (operator.equals("/")) {
                System.out.println(calc.division(number1, number2));
            } else {
                System.out.println("Invalid choice");
            }

            System.out.println("Operator: ");
            scanner = new Scanner(System.in);
            operator = scanner.next();
        }
    }
}
