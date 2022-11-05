package HelloWorld;

public class HelloWorld {
    // Storing ANSI escape code into variable to add styling to the text in the command line
    public static final String ANSI_PURPLE = "\u001B[35m";
    /*
    Always reset the styling, or
    it will overlap on the following code.
     */
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello World!" + ANSI_RESET);
    }
}
