package org.example.pool;


import java.time.LocalDate;

public class DateTimeTest {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();


        System.out.println(localDate.toString());

        //System.out.println(localDate.getDayOfYear());

        int i = Integer.parseInt(localDate.toString().split("-")[0]) + 4;

        System.out.println(i);

    }

}
