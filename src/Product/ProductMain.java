package Product;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductMain {
    static Product water = new Product("Water",1.00f,00);
    static Product sprite = new Product("Sprite",1.50f,10);
    static Product coke = new Product("Coke", 1.20f,10);
    static Product fanta = new Product("Fanta",1.30f,10);
    static Product orange = new Product("Orange", 1.10f,10);
    static Product[] products = {water,sprite,fanta,coke,orange};

    public static void main(String[] args) {
        float totalCard = 0;
        DecimalFormat money = new DecimalFormat("#.##");


        System.out.println("+----------------------------+\n" +
                "|       Vending Machine      |\n" +
                "+----------------------------+");

        for (int i = 0; i < products.length; i++) {
            System.out.println("\t " + (i + 1) + ". " + products[i].getName() + "\t" + products[i].getPrice() + "\t  " + products[i].getStock() + "\t ");
        }

        System.out.println("+----------------------------+\n" +
                "|Enter a number (0 = Exit):  |\n" +
                "+----------------------------+\n");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        while (choice != 0) {
            System.out.println("+----------------------------+\n" +
                    "|       Vending Machine      |\n" +
                    "+----------------------------+");

            for (int i = 0; i < products.length; i++) {
                System.out.println("\t " + (i+1) + ". " + products[i].getName() + "\t" + products[i].getPrice() + "\t  " + products[i].getStock() + "\t ");
            }

            System.out.println("+----------------------------+\n" +
                    "|Enter a number (0 = Exit):  |\n" +
                    "+----------------------------+\n");

            if(products[choice - 1].dispense() == true) {
                totalCard += products[choice - 1].getPrice();

            }

            System.out.println(products[choice - 1].getStock());
            System.out.println("Total: £"+money.format(totalCard));

            input = new Scanner(System.in);
            choice = input.nextInt();

        }
        System.out.println("Your total is £" + money.format(totalCard)+".");
    }
}
