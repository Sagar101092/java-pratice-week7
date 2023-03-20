package javaweek7homework;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 */
public class Program1_OddEvenNumber {

    // main method
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        evenOdd(num);//Calling Static method
    }

    /**
     * This method is used to find th odd even number
     *It is Static method
     * @param num
     */
    public static void evenOdd(int num) {
        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd + " number");

    }

}

