package com.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter a year to check whether the Year is a Leap Year or not");
//        int year = scan.nextInt();

        LocalDate date = LocalDate.now();
        System.out.println(date);
    }

    static boolean isLeapYear(int year){
        if(year%4==0 && (year%100!=0 || year%400==0)){
            return true;
        }else {
            return false;
        }
    }
}
