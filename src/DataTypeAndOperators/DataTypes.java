package DataTypeAndOperators;

public class DataTypes {
    public static void main(String[] args) {
        // Below are the primitives types (apart from String)
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

        // Wrapper classes
        // They are designed to help conversion and formatting of numeric values
        // For each primitive there is a matching wrapper class
        Byte byteWrapper;
        Short shortWrapper;
        Integer intWrapper;
        Long longWrapper;
        Float floatWrapper;
        Boolean booleanWrapper;
        Character charWrapper;

        String doubleValue = "184.5";
        Double doubleObj = Double.parseDouble(doubleValue);
        Byte byteValue = doubleObj.byteValue();
        Integer intValue = doubleObj.intValue();
        Float floatValue = doubleObj.floatValue();
        String stringValue = doubleObj.toString();
        Long longValue = doubleObj.longValue();

        System.out.println(doubleValue); // data type: String
        System.out.println(doubleObj); // data type: Double
        System.out.println(byteValue); // data type: Byte
        System.out.println(intValue); // data type: Integer
        System.out.println(floatValue); // data type: Float
        System.out.println(stringValue); // data type: String
        System.out.println(longValue); // data type: Long

        // Primitive values are always signed (accept negative and positive numbers)
        // Long and Integer support unsigned operations
        Integer unsigned = Integer.parseUnsignedInt("30000");
        System.out.println("Unsigned value is " + unsigned);
        Integer result = Integer.divideUnsigned(unsigned, 20);
        System.out.println("The result is " + result);
    }
}
