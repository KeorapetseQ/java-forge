/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minisupermarket;

/**
 *
 * @author Keorapetse
 */
import java.util.Scanner;

public class MiniSupermarket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] products = {"Bread", "Milk", "Cereal", "Chicken", "Juice"};
        int[] stock = {20, 15, 10, 8, 25};

        int totalItemsSold = 0;
        int productChoice;
        int quantitySold;

        do {
            // Display products and stock
            System.out.println("\n===== MINI SUPERMARKET STOCK SYSTEM =====");

            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i]
                        + " - Stock: " + stock[i]);
            }

            System.out.println("0. Exit");

            // Select product
            System.out.print("\nSelect a product (0 to exit): ");
            productChoice = input.nextInt();

            if (productChoice == 0) {
                break;
            }

            // Validate product choice
            if (productChoice < 1 || productChoice > products.length) {
                System.out.println("Invalid product selection!");
                continue;
            }

            int index = productChoice - 1;

            // Enter quantity sold
            System.out.print("Enter quantity sold: ");
            quantitySold = input.nextInt();

            // Validate quantity
            if (quantitySold <= 0) {
                System.out.println("Quantity must be greater than 0!");
            }
            // Prevent selling more than available stock
            else if (quantitySold > stock[index]) {
                System.out.println("Not enough stock available!");
                System.out.println("Available stock: " + stock[index]);
            }
            else {
                // Subtract quantity sold
                stock[index] -= quantitySold;

                // Update total items sold
                totalItemsSold += quantitySold;

                System.out.println(quantitySold + " "
                        + products[index] + "(s) sold successfully.");

                System.out.println("Updated stock: " + stock[index]);

                // Identify products below 5
                if (stock[index] < 5) {
                    System.out.println("WARNING: " + products[index]
                            + " stock is below 5!");
                }
            }

        } while (productChoice != 0);

        // Display final stock
        System.out.println("\n===== FINAL STOCK LEVELS =====");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i] + ": " + stock[i]);

            if (stock[i] < 5) {
                System.out.println("  ** LOW STOCK **");
            }
        }

        System.out.println("\nTotal items sold: " + totalItemsSold);

        input.close();
    }
}