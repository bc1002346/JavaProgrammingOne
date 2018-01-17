package Chapter2;

import java.util.Scanner;

/**
 * Program to Calculate area and volume of cylinders
 *
 * @author Brandon Cox
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double area, volume;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Radius and Length of the Cylinder");
        double length = s.nextDouble();
        double radius = s.nextDouble();
        area = (radius) * (3.14) * (radius);
        volume = (area) * (length);
        System.out.println("Area of a Cylinder" + area);
        System.out.println("Volume of a Cylinder" + volume);
    }

}
