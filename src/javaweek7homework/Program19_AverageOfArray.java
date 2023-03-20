package javaweek7homework;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Program19_AverageOfArray {
    //Main method
    public static void main(String[] args) {
        average();//Calling Static method
    }

    /**
     * This method is use to find the average value of array elements.
     * This is static method
     */
    public static void average() {
        int[] numbers = new int[]{20, 30, 25, 35, 60};
        //calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
