
package bankaccount;
import java.util.Scanner;
/**
 *
 * @author Keorapetse
 */
public class BankAccount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double balance = 1000.00;
        int choice;

        System.out.println("SIMPLE BANK ACCOUNT");

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice == 1) {

                System.out.println("Your balance is: M" + balance);

            } else if (choice == 2) {

                System.out.print("Enter amount to deposit: M");
                double deposit = input.nextDouble();

                if (deposit > 0) {
                    balance = balance + deposit;
                    System.out.println("Money deposited successfully!");
                    System.out.println("New balance: M" + balance);
                } else {
                    System.out.println("Amount must be greater than 0.");
                }

            } else if (choice == 3) {

                System.out.print("Enter amount to withdraw: M");
                double withdrawal = input.nextDouble();

                if (withdrawal <= 0) {
                    System.out.println("Amount must be greater than 0.");
                } else if (withdrawal > balance) {
                    System.out.println("Not enough money in your account.");
                } else {
                    balance = balance - withdrawal;
                    System.out.println("Money withdrawn successfully!");
                    System.out.println("Remaining balance: M" + balance);
                }

            } else if (choice == 4) {

                System.out.println("Thank you for using the bank!");

            } else {

                System.out.println("Invalid option.");
            }

        } while (choice != 4);

        input.close();
   
    }
    
}
