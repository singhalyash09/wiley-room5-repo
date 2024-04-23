package com.practice;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year to check whether the Year is a Leap Year or not");
        int year = scan.nextInt();

        if(year%4==0 && (year%100!=0 || year%400==0)){
            System.out.println("The Entered Year "+year+ " is a Leap Year.\n Yayy! We got an Extra Day");
        }else {
            System.out.println("The Entered Year is not a Leap Year.");
        }
    }
}
