package org.example.pool;

import java.time.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();

        //return the current instant
        Instant instant = clock.instant();
        System.out.println("The instant right now is: " +instant);

        //get the zone id
        ZoneId zone = ZoneId.systemDefault();
        System.out.println("The zone id is: " + zone);

        //ZonedDateTime to get the year
        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println("The zonedDateTime is: " + zonedDateTime);
        int year = zonedDateTime.getYear();
//        int monthValue = zonedDateTime.getMonthValue();

        //get monthName to print
        Map<String, Integer> months = new HashMap<>();
        months.put("January", 1);
        months.put("February", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);

        //user input month
        System.out.print("Enter month value (from 1 to 12): ");
        Scanner scanner = new Scanner(System.in);
        int monthValue = scanner.nextInt();

        for (Map.Entry<String, Integer> entry : months.entrySet()) {
            String key = null;
            Integer value = entry.getValue();
//            System.out.println(key + " -> " + value);

            if(monthValue == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }




        //get key and value

//        if (monthValue == )


        //separate the Instant into each component and return them as `name: component`
        LocalDate  localDate = LocalDate.ofInstant(instant, zone);
        LocalDate localTime = LocalDate.ofInstant(instant, zone);
//       System.out.println(localDate);
//        System.out.println("The year of this instant is: " + year);
//        System.out.println("The month of this instant is: ");

    }
}
