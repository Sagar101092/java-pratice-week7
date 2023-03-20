package javaweek7homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Program2_LeapYear {
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        leapYear(year);//Calling Static method
    }

    /**
     * This method is used to find leap year
     * It is static method
     *
     * @param year
     */
    public static void leapYear(int year) {

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else System.out.println(year + " is not a leap year.");
    }
}

