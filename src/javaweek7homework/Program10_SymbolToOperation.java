package javaweek7homework;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Program10_SymbolToOperation {
    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter First Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter symbol from (+,-,*,/) :");
        String symbol = sc.next();
        operation(num1, num2, symbol);//Calling static method
    }

    /**
     * This method is use to find the Addition,Substation,Division,Multiplication
     * This is Static method
     *
     * @param num1
     * @param num2
     * @param symbol
     */
    public static void operation(int num1, int num2, String symbol) {

        if (symbol.equals("+")) {
            int ans = num1 + num2;
            System.out.println("Your ans is :" + ans);

        } else if (symbol.equals("-")) {
            int ans = num1 - num2;
            System.out.println("Your ans is :" + ans);

        } else if (symbol.equals("*")) {
            int ans = num1 * num2;
            System.out.println("Your ans is :" + ans);

        } else if (symbol.equals("/")) {
            int ans = num1 / num2;
            System.out.println("Your ans is :" + ans);
        } else {
            System.out.println("Invalid Operator input");
        }
    }
}
