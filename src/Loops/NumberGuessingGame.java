package Loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess a number between 0 and 100: ");
        Integer guesses = 1;

        // The computer picks a random number between 0 and 100
        Random rand = new Random();
        Integer randNum = rand.nextInt(101); // because the range is for numbers between 0 and 100

        // We use Scanner to get the user's input. We then need to change the data type from Scanner to an Integer to be able to compare it with the computer's random Integer.
        Scanner input = new Scanner(System.in);
        Integer numInput = input.nextInt();

        // We use a do loop to check if the user guessed the random number and help them find it with indications (lower and higher)
        do {
            guesses++; // Increase the counter for every guess
            if (numInput < randNum) {
                System.out.println("Higher: ");
            } else {
                System.out.println("Lower: ");
            }
            input = new Scanner(System.in);
            numInput = input.nextInt();
        } while (numInput != randNum);

        if(numInput == randNum) {
            System.out.println("🎉 Congratulations, you found the number " +randNum+ " in " + guesses + " guesses! 🎉");
        }
    }
}
