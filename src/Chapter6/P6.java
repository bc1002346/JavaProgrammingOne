package Chapter6;

import java.util.Scanner;

/**
 * Program to display money conversions
 *
 * @author Brandon Cox
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        String yes_no = "";
        Scanner input = new Scanner(System.in);
        double euro_ammount = 0;
        double pound_ammount = 0;
        double yen_ammount = 0;
        System.out.println("How many Euros does a dollar buy?");
        double euro_conversion = input.nextDouble();
        System.out.println("How many Pound Sterling does a dollar buy?");
        double pound_conversion = input.nextDouble();
        System.out.println("How many Yen does a dollar buy?");
        double yen_conversion = input.nextDouble();

        while (!yes_no.equalsIgnoreCase("no")) {
            System.out.println("Enter amount of dollars you wish to convert: ");
            double dollar_amount = input.nextDouble();
            System.out.println("Enter E to buy Euros, P to buy Pounds or Y to buy Yen: ");
            String Convert = input.next().toLowerCase();
            switch (Convert) {
                case "e":
                    double eurosBought = conversion(dollar_amount, euro_conversion);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollar_amount, eurosBought);
                    break;
                case "p":
                    double poundsBought = conversion(dollar_amount, pound_conversion);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollar_amount, poundsBought);
                    break;
                case "y":
                    double YenBought = conversion(dollar_amount, yen_conversion);
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", dollar_amount, YenBought);
                    break;

            }

            do {
                System.out.println("Do you have any more conversions? Enter yes or no.");
                yes_no = input.next().toLowerCase();
            } while (!yes_no.equalsIgnoreCase("no") && !yes_no.equalsIgnoreCase("yes"));
        }

    }

    /**
     * Method
     *
     * @param dollar_amount the amount of dollars being converted
     * @param currency the total of the conversion
     * @return the total
     */
    public static double conversion(double dollar_amount, double currency) {
        double Total;
        double extra_fee;
        if (dollar_amount > 100) {
            //apply a 5% fee
            extra_fee = dollar_amount * .05;
            Total = (dollar_amount - extra_fee) * currency;
        } else {
            //apply a 5% fee
            extra_fee = dollar_amount * .10;
            Total = (dollar_amount - extra_fee) * currency;
        }
        return Total;
    }
}
