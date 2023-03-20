package javaweek7homework;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Program17_ShortArray {
    //Main method
    public static void main(String[] args) {
        operation();// Calling static method
    }

    /**
     * This method is ude to short a numeric array and a string array.
     */
    public static void operation() {
        int number[] = {8, 3, 5, 1, 4};
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        char alphabet[] = {'s', 'k', 'a', 'z', 'r'};
        Arrays.sort(alphabet);
        System.out.println(Arrays.toString(alphabet));

    }
}
