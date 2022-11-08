package Functions;

import java.util.Scanner;

public class DeveloperTeaTime {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a 'tea' and press Enter to announce developer tea time.");

        Scanner input = new Scanner(System.in);
        String userInput = input.next();

        if(userInput.equals("tea")) {
            System.out.println("It is developer tea time");
        } else {
            System.out.println("Waiting for developer tea time...");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to DevWorld!");
        announceDeveloperTeaTime();
    }
}
