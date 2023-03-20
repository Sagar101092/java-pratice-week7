package javaweek7homework;

import java.util.Scanner;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */
public class Program4_LeapYear {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        isLeapYear(year);// Calling Static method

        System.out.println("Enter month :");
        int month = sc.nextInt();
        System.out.println("Enter year :");
        int yrs = sc.nextInt();
        getDaysInMonth(month, yrs);// Calling Static method
    }

    /**
     * This method id used to find year is leep year or not
     * This is Static method
     *
     * @param year
     */
    public static void isLeapYear(int year) {
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        // boolean result;
        //  boolean step;
        if (year >= 1 && year <= 9999) {
            // System.out.println(result = true);
            if (isLeapYear) {
                // step = true;
                System.out.println(year + " is a leap year.");

            } else
                //step = false;
                System.out.println(year + " is not a leap year.");

        } else {
            System.out.println("Since the parameter is not in the range(1-9999)");
        }


    }

    /**
     * This method is use to calculate days in a month
     * This is static method
     *
     * @param month
     * @param year
     */
    public static void getDaysInMonth(int month, int year) {

        String MonthOfName = "Unknown";
        int number_Of_DaysInMonth = 0;

        if (month <= 0) {
            System.out.println("Since the parameter month is invalid.");
        } else if (year <= 0 || year > 9999) {
            System.out.println("since the parameter year is outside the range of 1 to 9999");
        } else {
            switch (month) {
                case 1:
                    MonthOfName = "January";
                    number_Of_DaysInMonth = 31;
                    break;
                case 2:
                    MonthOfName = "February";
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        number_Of_DaysInMonth = 29;
                    } else {
                        number_Of_DaysInMonth = 28;
                    }
                    break;
                case 3:
                    MonthOfName = "March";
                    number_Of_DaysInMonth = 31;
                    break;
                case 4:
                    MonthOfName = "April";
                    number_Of_DaysInMonth = 30;
                    break;
                case 5:
                    MonthOfName = "May";
                    number_Of_DaysInMonth = 31;
                    break;
                case 6:
                    MonthOfName = "June";
                    number_Of_DaysInMonth = 30;
                    break;
                case 7:
                    MonthOfName = "July";
                    number_Of_DaysInMonth = 31;
                    break;
                case 8:
                    MonthOfName = "August";
                    number_Of_DaysInMonth = 31;
                    break;
                case 9:
                    MonthOfName = "September";
                    number_Of_DaysInMonth = 30;
                    break;
                case 10:
                    MonthOfName = "October";
                    number_Of_DaysInMonth = 31;
                    break;
                case 11:
                    MonthOfName = "November";
                    number_Of_DaysInMonth = 30;
                    break;
                case 12:
                    MonthOfName = "December";
                    number_Of_DaysInMonth = 31;
                    break;

            }
            System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
        }
    }
}

