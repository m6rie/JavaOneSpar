package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // we can convert a list into an array
        int[] myIntArray = {34, 53,96, 12, 76, 12, 30, 60, 65, 34};
        Integer[] myIntArray2 = {34, 53,96, 12, 76, 12, 30, 60, 65, 34};
//        List<Integer> myList = java.util.Arrays.asList(myIntArray); // Gives an error because int != Integer
        List<Integer> myList2 = java.util.Arrays.asList(myIntArray2);

        // to reassign a value we have to call the set function. set(index, newValue)
        myList2.set(2, 0);

        // to add a value we have to call the add function.
//        myList2.add(3); // This gives an error because we cannot modify the length of an array and this list inherited the array's characteristic. To be able to modify it we need an ArrayList.
        for(Integer i: myList2) {
            System.out.print(i + " ");
        }

        System.out.println("\n----------------");

        // we passed a list (which was first an array) to the ArrayList
        ArrayList<Integer> myArrayList = new java.util.ArrayList<>(myList2);
        myArrayList.add(3);
        for(Integer i: myArrayList){
            System.out.print(i + " ");
        }
        System.out.println("\n" + myArrayList.contains(8));

        // to sort an ArrayList we need to call Collections.sort
        Collections.sort(myArrayList);
        for(Integer i: myArrayList){
            System.out.print(i + " ");
        }
        System.out.println("\n----------------");

        // to create a new MUTABLE list from scratch
        List<Integer> newList = new ArrayList<>(List.of(3,5,7,8,0,1));
        for(Integer i: newList){
            System.out.print(i + " ");
        }
        newList.add(87);
        newList.add(0,9000);
        System.out.println();
        for(Integer i: newList){
            System.out.print(i + " ");
        }

        System.out.println("\n----------------");

        // to create a new IMMUTABLE list from scratch
        List<Integer> newList2 = List.of(3,5,7,8,0,1);
        // newList2.add(800); // gives an error message because the list is immutable
        for(Integer i: newList2){
            System.out.print(i + " ");
        }
    }
}
