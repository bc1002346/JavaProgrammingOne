package Chapter3;

import java.util.Scanner;

/**
 * Program to display If an int is divisible but 5, 6, or both
 *
 * @author Brandon Cox
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:");
        int x = input.nextInt();
        boolean dby5 = false;
        boolean dby6 = false;

        if (x % 5 == 0) {
            dby5 = true;
        }

        if (x % 6 == 0) {
            dby6 = true;
        }

        System.out.println("Is int divisible by 5 and 6? " + (dby5 && dby6));
        System.out.println("Is int divisible by 5 or 6? " + (dby5 || dby6));
        System.out.println("Is int divisible by 5 or 6, but not both? "
                + (dby5 ^ dby6));

    }

}
