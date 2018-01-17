package Chapter3;

import java.util.Scanner;

/**
 * Program to display which package has a better price
 *
 * @author Brandon Cox
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight and price for 1st package:");
        double w1 = input.nextDouble();
        double p1 = input.nextDouble();
        System.out.println("Enter weight and price for 2nd package:");
        double w2 = input.nextDouble();
        double p2 = input.nextDouble();
        double r = w2 / p2 - w1 / p1;
        String s = "";

        if (r < 0) {
            System.out.println("Package1 has the better price.");
            System.exit(0);
        } else if (r > 0) {
            System.out.println("Package2 has thebetter price.");

        }

    }

}
