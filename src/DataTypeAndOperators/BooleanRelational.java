package DataTypeAndOperators;

public class BooleanRelational {
    public static void main(String[] args) {
        System.out.println(4==4); // true
        System.out.println(4!=4); // false
        System.out.println(4!='4'); // true because the data type is different
        System.out.println(Boolean.parseBoolean("true")); // true
        System.out.println(Boolean.parseBoolean("it is true")); // false
        System.out.println(Boolean.parseBoolean("truee")); // false
    }
}
