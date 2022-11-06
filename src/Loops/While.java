package Loops;

public class While {
    public static void main(String[] args) {
        boolean loopControl = true;
        int result = 0;
        int number = 0;

/*
        while(loopControl){
            System.out.println("In control.");
        }
*/

        while(result < 10) {
            if(result % 2 == 0) {
                result++;
                System.out.println("Odd number: " + result);
            } else {
                System.out.println("Even number: " + (result+1));
                result++;
            }
        }

        // the condition is checked at the end
        do {
            number += 3;
            System.out.println(number + " is a multiple of 3");
        } while (number < 30);
    }
}
