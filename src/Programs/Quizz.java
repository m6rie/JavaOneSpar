package Programs;

import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) {
        boolean playing = true;
        String question = "What is one of the most common tree in the UK? (write the correct answer below)";
        String choiceOne = "Red Maple";
        String choiceTwo = "Silver Birch";
        String choiceThree = "Scots Pine";

        String solution = choiceTwo;

        System.out.println("\n" + question +
                "\n" + choiceOne +
                "\n" + choiceTwo +
                "\n" + choiceThree);

        // The correct answer is a string with a space. To get the program to take the entire string as the user input we can either use the in-built ".useDelimiter("\n")" or "nextLine()"
        Scanner userInput = new Scanner(System.in);
        String userChoice = userInput.nextLine().toLowerCase();

        while(playing) {
            if(userChoice.equals(solution.toLowerCase())) {
                System.out.println("Right answer!");
                playing = false;
            } else {
                System.out.println("Wrong answer.");
                userInput = new Scanner(System.in).useDelimiter("\n");
                userChoice = userInput.next();
            }
        }
    }
}
