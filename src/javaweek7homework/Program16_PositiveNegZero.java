package javaweek7homework;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Program16_PositiveNegZero {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();
        operation(num);//Calling Static method
    }

    /**
     * This method is use to find  enter number is “POSITIVE”, “NEGATIVE” or "ZERO”
     * This is static method
     *
     * @param num
     */
    public static void operation(int num) {
        if (num > 0) {
            System.out.println("This is positive number");
        } else if (num < 0) {
            System.out.println("This is Negative number");
        } else {
            System.out.println("This number is zero");
        }
    }
}
