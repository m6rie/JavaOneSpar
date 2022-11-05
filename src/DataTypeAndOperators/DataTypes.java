package DataTypeAndOperators;

public class DataTypes {
    public static void main(String[] args) {
        int One = 1;
        double fiveTwo = 5.2;
        char hey = 'A';
        String word = "things";
        float number = 33.2f;
        boolean fact = true;

        System.out.println(fiveTwo + number);
        System.out.println(One + " " + hey + " " + word);
        System.out.println(One + hey); // turns the char A into its ASCII code value which is 65
        System.out.println(fact);
    }
}
