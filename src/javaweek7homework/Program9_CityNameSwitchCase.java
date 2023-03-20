package javaweek7homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use Switch case) if
 * any other alphabet should be invalid entry
 */
public class Program9_CityNameSwitchCase {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F : ");
        String city = sc.next();
        String upperCAse = city.toUpperCase();
        cityName(upperCAse);// Calling static method
    }

    /**
     * This method is used to find city name as per alphabate enter by user
     * This is static method
     *
     * @param cityName
     */
    public static void cityName(String cityName) {

        switch (cityName) {
            case "A":
                System.out.println("City from A is Ahmedadabad");
                break;
            case "B":
                System.out.println("City from B is Bhavnagar");
                break;
            case "C":
                System.out.println("City from C is Charada");
                break;
            case "D":
                System.out.println("City from D is Dwarka");
                break;
            case "E":
                System.out.println("City from E is Etawah");
                break;
            case "F":
                System.out.println("City from F is Faizabad");
                break;
            default:
                System.out.println("Invalid Alphabet");
        }
    }


}
