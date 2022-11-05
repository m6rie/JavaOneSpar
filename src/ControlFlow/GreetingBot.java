package ControlFlow;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GreetingBot {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime morningBeginning = LocalTime.of(5,00,00);
        LocalTime morningEnd = LocalTime.of(12,00,00);
        LocalTime afternoonEnd = LocalTime.of(18,00,00);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;


        if(now.isAfter(morningBeginning) && now.isBefore(morningEnd)) {
            System.out.println("Good Morning, it is " + now);
        } else if (now.isAfter(morningEnd) && now.isBefore(afternoonEnd)) {
            System.out.println("Good Afternoon, it is " + now);
        } else {
            System.out.println("Good Evening, it is " + now);
        }
    }
}
