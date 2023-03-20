package javaweek7homework;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Program11_DivisibleBy3And5 {

    // Main method
    public static void main(String[] args) {
        int a = 3;//Declare Local Variable
        int b = 5;//Declare Local Variable
        operation1(a);//Calling Static method
        operation2(b);//Calling Static method
    }

    /**
     * This method is use to find the number which is can be divided by 3
     * This is static method
     *
     * @param num
     */
    public static void operation1(int num) {
        if (num <= 100) {
            System.out.println(num);
            operation1(num + 3);
        }
    }

    /**
     * This method is use to find the number which is can be divided by 5
     * This is static method
     *
     * @param num
     */
    public static void operation2(int num) {
        if (num <= 100) {
            System.out.println(num);
            operation2(num + 5);
        }
    }
}
