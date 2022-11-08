package Functions;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class MealCalculator {
    public static double mealCal(double mealPrice) {
        double TIP_RATE = 20.00/100; // The tip rate is a constant
        double TAX_RATE = 12.50/100; // The tax rate is a constant
        double tip = TIP_RATE * mealPrice;
        double tax = TAX_RATE * mealPrice;
        DecimalFormat money = new DecimalFormat("#.##");

        double result = mealPrice + tip + tax;
//        System.out.println("The total meal price is " + money.format(result) + ".");
        return parseDouble(money.format(result));
    }

    public static void main(String[] args) {
        System.out.println("What is the price of your meal? ");
        Scanner inputPrice = new Scanner(System.in);
        double price = inputPrice.nextDouble();
        System.out.println("The total meal price is £" + mealCal(price) + ".");

        System.out.println("Between how many people are you splitting the bill?");

        Scanner inputParticipant = new Scanner(System.in);
        int participant = inputParticipant.nextInt();

        double indivPrice = mealCal(price) / participant;

        System.out.println("Each participant must pay £" + indivPrice + ".");
    }
}
