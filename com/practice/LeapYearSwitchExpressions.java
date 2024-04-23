package com.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LeapYearSwitchExpressions {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        String message = switch (dayOfWeek){
            case MONDAY,TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Work Hard";
            case SATURDAY, SUNDAY -> "Enjoy!";
        };
        System.out.println(dayOfWeek +" "+ message);
    }
}
