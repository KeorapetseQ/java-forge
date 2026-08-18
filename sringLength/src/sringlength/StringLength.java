package sringlength;

//Tlhohonolofatso Qoane
import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("Length: " + text.length());

        input.close();
    }
}
