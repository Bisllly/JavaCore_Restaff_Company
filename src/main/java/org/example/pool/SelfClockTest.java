package org.example.pool;

import java.time.*;

public class SelfClockTest {
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
        int month = zonedDateTime.getMonthValue();


        //separate the Instant into each component and return them as `name: component`
        LocalDate  localDate = LocalDate.ofInstant(instant, zone);
        LocalDate localTime = LocalDate.ofInstant(instant, zone);
//        System.out.println(localDate);
        System.out.println("The year of this instant is: " + year);
        System.out.println("The month of this instant is: " + month);

    }
}
