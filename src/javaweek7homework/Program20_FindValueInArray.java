package javaweek7homework;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Program20_FindValueInArray {
    // Main method
    public static void main(String[] args) {
        logic();// Calling static method
    }

    /**
     * This method is use to find ,if an array contains a specific value.
     */
    public static void logic() {
        int[] myArray = {55, 45, 69, 44};
        int num = 55;

        for (int i = 0; i < myArray.length; i++) {
            if (num == myArray[i]) {
                System.out.println("Array contains the given element");
            }
        }
    }
}

