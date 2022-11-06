package Loops;

import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        int[] integerArray = {1,530,6,99,12,182,25,229,37};
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Harrison");
        nameList.add("Nadia");
        nameList.add("Bobette");
        nameList.add("Nyassi");
        nameList.add("Antonia");

        for(int i: integerArray) {
            System.out.print(i + " ");
        }

        System.out.println("\n-----------------------");

        for(int i = 0; i < integerArray.length; i++){
            System.out.print(integerArray[i] + " ");
        }

        System.out.println("\n-----------------------");

        for(int i = 0; i < integerArray.length; i++){
            System.out.println("Element number " + i + " is " + integerArray[i] + " ");
        }

        System.out.println("\n-----------------------");

        for(String i: nameList){
            System.out.print(i + " ");
        }

        System.out.println("\n-----------------------");

        for(int i = 0; i < nameList.size(); i++){
            System.out.print(nameList.get(i) + " ");
        }
    }
}
