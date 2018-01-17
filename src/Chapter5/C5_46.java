package Chapter5;

import java.util.Scanner;

/**
 * Program to display a reversed string
 *
 * @author Brandon Cox
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // Reverse the string
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }

        // Display the string in reverse order
        System.out.println("The reversed string is " + reverse);
    }

}
