package org.example;

import java.util.Arrays;

public class Date {
    int []day;
    int []month;
    int []year;
    public Date(){}
    public Date(int day, int month, int year){
        this.day = new int[]{day};
        this.month = new int[]{month};
        this.year = new int[]{year};
    }

    public int[] getDay() {
        return day;
    }

    public void setDay(int[] day) {
        this.day = day;
    }

    public int[] getMonth() {
        return month;
    }

    public void setMonth(int[] month) {
        this.month = month;
    }

    public int[] getYear() {
        return year;
    }

    public void setYear(int[] year) {
        this.year = year;
    }

    void setDate(int day, int month, int year){
        Date a = new Date();
        for(int i = 1; i<=31;i++){
            a.day = new int[]{i};
        }
        for(int j = 1; j<=12;j++){
            a.month = new int[]{j};
        }
        for(int z = 1999; z<=2023; z++){
            a.year = new int[]{z};
        }
    }
    @Override
    public String toString() {
        return "Date{" +
                "day=" + Arrays.toString(day) +
                ", month=" + Arrays.toString(month) +
                ", year=" + Arrays.toString(year) +
                '}';
    }
}
