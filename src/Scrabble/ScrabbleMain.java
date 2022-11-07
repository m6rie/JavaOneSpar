package Scrabble;

import java.util.Scanner;

public class ScrabbleMain {
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String RESET = "\033[0m";
    public static void main(String[] args) {
        ScrabbleScore scrabbleScorer = new ScrabbleScore();

        System.out.println("\n" +
                GREEN_BOLD_BRIGHT +"       Scrabble Score Calculator      "+RESET +
                "\n+-------------------------------------+\n" +
                "| Which word do you need a score for? |\n" +
                "+-------------------------------------+\n" +
                "|       To exit, press 0 + Enter      |\n" +
                "+-------------------------------------+\n");


        Scanner wordInput = new Scanner(System.in);
        String wordString = wordInput.next();
        System.out.println(
                "\n+-------------------------------------+\n" +
                "\t" + wordString + " is worth " + scrabbleScorer.scrabbleScore(wordString) + " points." +
                "\n+-------------------------------------+\n");
        while(!wordString.equals("0")) {
            System.out.println("\n" +
                    "+-------------------------------------+\n" +
                    "|              Next word:             |\n" +
                    "+-------------------------------------+\n" +
                    "|       To exit, press 0 + Enter      |\n" +
                    "+-------------------------------------+\n");
            wordInput = new Scanner(System.in);
            wordString = wordInput.next();
            System.out.println(
                    "\n+-------------------------------------+\n" +
                    "\t" + wordString + " is worth " + scrabbleScorer.scrabbleScore(wordString) + " points." +
                    "\n+-------------------------------------+\n");
        };
    }
}
