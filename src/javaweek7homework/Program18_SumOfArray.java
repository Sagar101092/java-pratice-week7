package javaweek7homework;

/**
 * Write a Java program to sum values of an array.
 */
public class Program18_SumOfArray {
    // Main method
    public static void main(String[] args) {
        operation();//calling static method
    }

    /**
     * This method is use to sum values of an array.
     * This is static method
     */
    public static void operation() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}

