package Scrabble;

import java.util.ArrayList;

public class ScrabbleScore {
    String[] letterArrays = {"AEIOULNRST","DG","BCMP","FHVWY","K","JX","QZ"};
    int[] points = {1,2,3,4,5,8,10};

    // Naming convention says that Java constants should be all UPPERCASE
    // A constant is a variable whose value cannot change once it has been assigned
    String ONE_POINT_SCORE = "AEIOULNRST";
    String TWO_POINT_SCORE = "DG";
    String THREE_POINT_SCORE = "BCMP";
    String FOUR_POINT_SCORE = "FHVWY";
    String FIVE_POINT_SCORE = "K";
    String EIGHT_POINT_SCORE = "JX";
    String TEN_POINT_SCORE = "QZ";

    public int scrabbleScore(String word) {
        int wordScore = 0;
        for(char letter: word.toUpperCase().toCharArray()) {
            for(int i = 0; i < letterArrays.length; i++) {
                if(letterArrays[i].indexOf(letter) != -1) {
                    wordScore += points[i];
                }
            }
        }
        return wordScore;
    }
}
