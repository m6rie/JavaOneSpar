package DataTypeAndOperators;

public class Operators {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String YELLOW = "\033[0;33m";

    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + 1+3 + ANSI_RESET); // concatenate the code
        System.out.printf("%s%s%s",YELLOW, 7-3, ANSI_RESET); //
        System.out.println("\n" + BLUE_BOLD + 5 + ANSI_RESET);
        System.out.println(55/2);
        System.out.println(55.5/2);
        System.out.println(3*7);
        System.out.println(10%3);
    }
}
