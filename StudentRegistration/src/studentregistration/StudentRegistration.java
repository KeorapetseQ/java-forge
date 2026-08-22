
package studentregistration;

import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your average mark: ");
        double average = scanner.nextDouble();

        System.out.print("Have you paid your registration fee? (true/false): ");
        boolean feePaid = scanner.nextBoolean();

        System.out.print("Do you have outstanding library books? (true/false): ");
        boolean outstandingBooks = scanner.nextBoolean();

        String result = (average >= 50 && feePaid && !outstandingBooks)
                ? "Registration Approved"
                : "Registration Denied";

        System.out.println("\nResult: " + result);

        scanner.close();
    }
}