package javaweek7homework;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program7_Commission {
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sale id ;");
        int saleId = sc.nextInt();
        System.out.println(" Enter your seller name :");
        String sellerName = sc.next();
        System.out.println(" Enter your sale amount  :");
        int amount = sc.nextInt();
        System.out.println(" Enter your basic salary  :");
        int basicsalary = sc.nextInt();
        commission(amount, basicsalary);// Calling Static method

    }

    /**
     * This method is used to calculate commission and find ur final salary
     * This is static method
     *
     * @param amount
     * @param basicsalary
     */
    public static void commission(int amount, int basicsalary) {
        double commissionPercentage = 0;
        if (amount >= 50000) {
            commissionPercentage = 35;
            double commission = (commissionPercentage / 100) * amount;
            double totalsalary = basicsalary + commission;
            System.out.println("Salary After Commission is : " + totalsalary);
        } else if (amount >= 30000) {
            commissionPercentage = 20;
            double commission = (commissionPercentage / 100) * amount;
            double totalsalary = basicsalary + commission;
            System.out.println("Salary After Commission is : " + totalsalary);
        } else if (amount >= 20000) {
            commissionPercentage = 10;
            double commission = (commissionPercentage / 100) * amount;
            double totalsalary = basicsalary + commission;
            System.out.println("Salary After Commission is : " + totalsalary);
        } else if (amount >= 10000) {
            commissionPercentage = 5;
            double commission = (commissionPercentage / 100) * amount;
            double totalsalary = basicsalary + commission;
            System.out.println("Salary After Commission is : " + totalsalary);
        } else if (amount < 10000) {
            commissionPercentage = 2;
            double commission = (commissionPercentage / 100) * amount;
            double totalsalary = basicsalary + commission;
            System.out.println("Salary After Commission is : " + totalsalary);
        } else {
            System.out.println("Salary After Commission is : " + basicsalary);
        }
    }
}
