package Chapter3;

import java.util.Scanner;

/**
 * Program to display if a number is greater than, less than, or equal to
 * another number
 *
 * @author Brandon Cox
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for X: ");
        double x = input.nextDouble();
        System.out.println("Enter a number for Y: ");
        double y = input.nextDouble();
        if (x < y) {
            System.out.println("X is less than to Y.");
        }
        if (x > y) {
            System.out.println("X is greater than Y.");
        }
        if (x == y) {
            System.out.println("X is equal to Y.");
        }
        if (x <= y) {
            System.out.println("X is less or equal to than Y.");
        }
        if (x != y) {
            System.out.println("X is not equal to Y.");
        }

        if (y == 0) {
            System.out.println("Can not divide by zero.");
        } else if (x / y < 1) {
            System.out.println("Proper Fraction.");
        } else {
            System.out.println("Improper Fraction");
        }

        if (x >= 90) {
            System.out.println("A");
        } else if (x >= 80) {
            System.out.println("B");
        } else if (x >= 70) {
            System.out.println("C");
        } else if (x >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (1 <= x && x <= 100) {
            System.out.println("In Range.");
        } else {
            System.out.println("Out of range.");
        }
    }
}
