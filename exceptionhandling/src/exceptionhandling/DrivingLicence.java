package exceptionhandling;
import java.util.Scanner;

public class DrivingLicence {

    // throws tells the caller that this method may throw an exception
    public static void checkAge(int age) throws Exception {

        if (age < 18) {
            // throw actually creates and sends the exception
            throw new Exception("You must be 18 or older to apply.");
        }

        System.out.println("You are eligible to apply for a driving licence.");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            // Code that might cause an exception
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            checkAge(age);
        }

        catch (Exception e) {
            // Handles the exception
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            // Executes whether an exception occurs or not
            System.out.println("Thank you for using the system.");
            input.close();
        }
    }
}