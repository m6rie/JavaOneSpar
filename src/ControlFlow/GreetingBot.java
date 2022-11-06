package ControlFlow;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GreetingBot {
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime morningBeginning = LocalTime.of(5,00,00);
        LocalTime morningEnd = LocalTime.of(12,00,00);
        LocalTime afternoonEnd = LocalTime.of(18,00,00);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedTime = now.format(formatter);

        System.out.println(BLUE_BOLD + "This is Greeting Bot" + ANSI_RESET);
        if(now.isAfter(morningBeginning) && now.isBefore(morningEnd)) {
            System.out.println("Good Morning, it is " + formattedTime);
        } else if (now.isAfter(morningEnd) && now.isBefore(afternoonEnd)) {
            System.out.println("Good Afternoon, it is " + formattedTime);
        } else {
            System.out.println("Good Evening, it is " + formattedTime);
        }
    }
}
