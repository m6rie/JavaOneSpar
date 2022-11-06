package Scrabble;

import Programs.Scrabble;

public class ScrabbleMain {
    public static void main(String[] args) {
        ScrabbleScore scrabbleScorer = new ScrabbleScore();

        System.out.println(scrabbleScorer.scrabbleScore("hey"));
    }
}
