package Collections;

public class Arrays {
    public static void main(String[] args) {
        // first specify the type of value, [] to indicate that it is an array, the name of the array, the = sign, {} to initialize the array, fill in the array with values
        int[] myIntArray = {34, 53,96, 12, 76, 12, 30, 60, 65, 34};

        for (int i: myIntArray) { // to print all the values from the array we have to loop through the array
            System.out.print(i+ " ");
        }
        System.out.println(myIntArray[1]); // to print the value at the index 1 of the array
        myIntArray[1] = 99; // to reassign the value at index 1 of the array
        System.out.println(myIntArray[1]);
        for (int i: myIntArray) {
            System.out.print(i+ " ");
        }
        System.out.println("");

        // we can also declare an array using the Integer class
        Integer[] myIntArray2 = {34, 53,96, 12, 76, 12, 30, 60, 65, 34};
        for (int i: myIntArray2) {
            System.out.print(i+ " ");
        }
    }
}
