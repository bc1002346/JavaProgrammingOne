package Chapter4;

import java.util.Scanner;

/**
 * Program to display a bidder with the highest pay for the least amount of
 * hours
 *
 * @author Brandon Cox
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//1
        System.out.println("Enter a Name for Bidder 1: ");
        String name1 = input.next();
//2
        System.out.println("Enter Numbers of Hours for Bidder 1: ");
        int hours1 = input.nextInt();
//3
        System.out.println("Enter a Price for Bidder 1: ");
        double price1 = input.nextDouble();
//4
        System.out.println("Enter a Name for Bidder 2: ");
        String name2 = input.next();
//5  
        System.out.println("Enter a Number Hours for Bidder 2: ");
        int hours2 = input.nextInt();
//6  
        System.out.println("Enter a Price for Bidder 2: ");
        double price2 = input.nextDouble();
//7
        double cost1;
        cost1 = (hours1 * price1);
//8
        double cost2;
        cost2 = (hours2 * price2);
//9 
        if (cost1 < cost2) {
            System.out.printf("Bidder 1 Wins! The total cost is %.2f ", cost1);
        }
//10
        if (cost1 > cost2) {
            System.out.printf("Bidder 2 Wins! The total cost is %.2f ", cost2);
        }
//11
        if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("Bidder 1 Wins! The total cost is %.2f", cost1);
            System.out.printf("The Hours are %d ", hours1);
        }
//12 
        if (cost1 == cost2 && hours1 > hours2) {
            System.out.printf("Bidder 2 Wins! The total cost is %.2f", cost2);
            System.out.printf("The Hours are %d", hours2);
        }
//13
        if (cost1 == cost2 && hours1 == hours2) {
            System.out.println("Bidder 1 and Bidder 2 have equal bids");
            System.out.printf("Bidder 1 total %.2f", cost1);
            System.out.printf(" The Hours are %d", hours1);
            System.out.printf(" Bidder 2 total cost: %.2f", cost2);
            System.out.printf(" The Hours are %d", hours2);
        }
    }
}
