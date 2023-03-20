package javaweek7homework;

/**
 * 14. Person
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 */
public class Program14_Person {
    String firstName = ""; //Declare Instance variable
    String lastName = ""; //Declare Instance variable
    int age = 0; //Declare Instance variable

    // Main method
    public static void main(String[] args) {

        Program14_Person person = new Program14_Person();
        person.setFirstName(""); // firstName is set to empty string setFirstName
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }

    /**
     * This method is use to get first name
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method is use to get last name
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method is use to get age
     *
     * @return
     */
    public int getAge() {

        return age;
    }

    /**
     * This method is use to set first name
     *
     * @param firstname
     */
    public void setFirstName(String firstname) {
        firstName = firstname;
    }

    /**
     * This method is use to set last name
     *
     * @param lastname
     */
    public void setLastName(String lastname) {
        lastName = lastname;
    }

    /**
     * This method is use to set age
     *
     * @param Age
     */
    public void setAge(int Age) {
        if (Age > 0 || Age < 100) {
            age = Age;
        }
    }

    /**
     * This method is use to check age if person is teen age or not
     *
     * @return
     */
    public boolean isTeen() {
        //int age = 0;
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method is use to get Full name
     *
     * @return
     */
    public String getFullName() {
        String fname = getFirstName();
        String lName = getLastName();
        // System.out.println(fname + " " + lName);
        return fname + " " + lName;
    }


}
