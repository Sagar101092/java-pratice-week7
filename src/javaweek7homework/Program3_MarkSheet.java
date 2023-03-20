package javaweek7homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Program3_MarkSheet {
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Name :");
        String name = sc.nextLine();
        System.out.println(" Enter RollNo :");
        int rollNo = sc.nextInt();
        System.out.println(" Enter Maths marks :");
        int maths = sc.nextInt();
        System.out.println(" Enter Science marks :");
        int science = sc.nextInt();
        System.out.println(" Enter English marks :");
        int english = sc.nextInt();
        markSheet(name, rollNo, maths, science, english);//Calling Static method

    }

    /**
     * This method is use to calculate mark sheet
     * This is static method
     * @param name
     * @param rollNo
     * @param maths
     * @param science
     * @param english
     */
    public static void markSheet(String name, int rollNo, int maths, int science, int english) {
        boolean fail = false;

        if (maths < 0 || science < 0 || english < 0) {
            System.out.println("Invalid data, Marks should between 0 to 100 ");
            //  fail = true;
        } else if (maths > 100 || science > 100 || english > 100) {
            System.out.println("Invalid data, Marks should between 0 to 100 ");
            // fail = true;
        } else {
            if (maths < 35 || science < 35 || english < 35)
                fail = true;

            String grade;
            int total = maths + science + english;

            Float Percentage = (float) ((total / 300.0) * 100);

            String result = "PASS";

            if (fail == true)
                result = "FAIL";


            // It will calculate the Grade
            if (Percentage >= 80)
                grade = "A+";
            else if (Percentage < 80 && Percentage >= 60)
                grade = "A";
            else if (Percentage < 60 && Percentage >= 50)
                grade = "B";
            else if (Percentage < 50 && Percentage >= 35)
                grade = "C";
            else
                grade = "invalid";

            System.out.println("_______________________________");
            System.out.println("|                             |");
            System.out.println("|         Mark Sheet          |");
            System.out.println("_______________________________");
            System.out.println("|   Name      :   " + name + "  |");
            System.out.println("|   RollNo    :   " + rollNo + "|");
            System.out.println("|______________________________|");
            System.out.println("|   Subjects    " + "Marks" + " |");
            System.out.println("_______________________________|");
            System.out.println("|   Maths    :   " + maths + "    |");
            System.out.println("|   Science    :" + science + "   |");
            System.out.println("|   English    :" + english + "   |");
            System.out.println("|_______________________________|");
            System.out.println("|   Total    :   " + total + "   |");
            System.out.println("|_______________________________|");
            System.out.println("| Percentage :" + Percentage + "   |");
            System.out.println("| Result    :   " + result + "   |");
            System.out.println("|   Grade    :   " + grade + "   |");
            System.out.println("|______________________________|");

        }


    }
}
