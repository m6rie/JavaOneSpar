package ControlFlow;

import java.util.Scanner;

public class AgeLimitMovies {
    public static void main(String[] args) {
        String u = "U";
        String pg = "PG";
        String twelve = "12";
        String fifteen = "15";

        System.out.println("How old are you? ");
        Scanner input = new Scanner(System.in);
        String age = input.next();
        int ageInt = Integer.parseInt(age);

        if(ageInt < 12) {
            System.out.println("You can watch " + u +" and "+ pg + " movies.");
        } else if (ageInt >= 12 && ageInt < 15) {
            System.out.println("You can watch " + u +", "+ pg +" and "+ twelve + " movies.");
        } else if (ageInt >= 15 && ageInt < 18) {
            System.out.println("You can watch " + u +", "+ pg +", "+ twelve +" and "+ fifteen + " movies.");
        } else {
            System.out.println("You can watch all the movies!");
        }
    }
}
