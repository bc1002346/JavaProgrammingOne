package Chapter2;

import java.util.Scanner;

/**
 * Program to convert Celcius to Fahrenheit
 *
 * @author Brandon Cox
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Celcius Tempature:");
        double celcius = s.nextDouble();
        fahrenheit = (9.0 / 5) * (celcius) + (32);
        System.out.println("Temperature in fahrenheit:" + fahrenheit);
    }

}
