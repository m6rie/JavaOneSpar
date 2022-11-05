package Variables;

public class StringMethod {
    public static void main(String[] args) {
        String message = "The planet Earth is 4.543 billion years.";
        String earthAge = message;
        String sunAge = message.replace("planet Earth", "Sun").replace("543", "603");

        System.out.println(earthAge.toLowerCase());
        System.out.println(message);
        System.out.println(sunAge);
    }
}
