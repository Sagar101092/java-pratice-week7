package javaweek7homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program8_CityNameIfElse {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F : ");
        String city = sc.next();
        String upperCAse = city.toUpperCase();
        cityName(upperCAse);//Calling static method

    }

    /**
     * This method is used to find city name as per alphabate enter by user
     * This is static method
     *
     * @param cityName
     */
    public static void cityName(String cityName) {
        if (cityName.equals("A")) {
            System.out.println("City from A is Ahmemadabad");
        } else if (cityName.equals("B")) {
            System.out.println("City from B is Bhavnagar");
        } else if (cityName.equals("C")) {
            System.out.println("City from C is Charada");
        } else if (cityName.equals("D")) {
            System.out.println("City from D is Dwarka");
        } else if (cityName.equals("E")) {
            System.out.println("City from E is Etawah");
        } else if (cityName.equals("F")) {
            System.out.println("City from F is Faizabad");
        } else {
            System.out.println("Invalid Alphabet");
        }

    }
}
