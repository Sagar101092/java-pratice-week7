package javaweek7homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program6_OddEven {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        oddEven(num);// Calling Main method

    }

    /**
     * This method is uded to calculate odd or even number
     * This is a static method
     *
     * @param number
     */
    public static void oddEven(int number) {
        //int number = 3;
        if (number % 2 == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }

    }
}
