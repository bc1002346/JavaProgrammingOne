package Chapter2;

import java.util.Scanner;

/**
 * Program to display Gratuity
 *
 * @author Brandon Cox
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;
        System.out.println("Gratuity:" + gratuity
                + " Total:" + total);
    }

}
