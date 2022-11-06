package Functions;

public class Functions101 {
    public static void printSomething() {
        System.out.println("Printing something");
    }

    public static void printName(String name, String lastname) {
//        name = "Stuart";
        System.out.println("Hey " + name + " " + lastname);
    }

    public static String makingFullName(String firstName, String lastName) {
//        String fullname = firstName + " " + lastName;
//        return fullname;
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        printSomething();
        printName("Berry", "Gordy");
        System.out.println(makingFullName("Ana","Stasia"));
    }

}
