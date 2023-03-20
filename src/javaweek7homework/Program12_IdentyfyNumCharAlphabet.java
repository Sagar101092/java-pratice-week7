package javaweek7homework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12_IdentyfyNumCharAlphabet {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any ahphbet/num/symbol :");
        char ch = sc.next().charAt(0);
        operation(ch);// Calling Static method
    }

    /**
     * This method is use to tell  us input value is number or an alphabet or symbol.
     * This is a static method
     *
     * @param ch
     */
    public static void operation(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A DIGIT.");

        } else {

            System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    }
}
