package Chapter2;

import java.util.Scanner;

/**
 * Program to display a full mean price
 *
 * @author Brandon Cox
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double tip = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Meal Price"
                + "Enter Drink Price"
                + "Enter Dessert Price");
        double meal = input.nextDouble();
        double drink = 0;
        double dessert = 0;
        double meal_price = (meal) + (drink) + (dessert);
        System.out.println("Meal Price" + meal_price);
        double sales_tax;
        sales_tax = (meal_price) * (10) / (meal_price);
        System.out.println("Sales Tax: " + sales_tax);
        tip = (meal_price) * (15) / (tip);
        System.out.println("Tip: " + tip);
        double total = (meal_price) + (sales_tax) + (tip);
    }
}
