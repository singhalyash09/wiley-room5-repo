package com.practice;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Enumeration {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SUNDAY;
        System.out.println(day);
        days entry = days.MONDAY;
        System.out.println(day+" "+entry);

        System.out.println("Enter the today's day");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();

        if(data.equals("SUNDAY")) {
            entry = days.FUNDAY;
            entry = days.valueOf("FUNDAY");
        }
        System.out.println("Updated Day : " + entry);
    }
}

enum days{
    FUNDAY(1), MONDAY(7), TUESDAY(6), WEDNESDAY(5), THURSDAY(4), FRIDAY(3), SATURDAY(2);

    final int value;
    days(int value){
        this.value = value;
    }
}
