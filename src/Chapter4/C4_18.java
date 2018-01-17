package Chapter4;

import java.util.Scanner;

/**
 * Program to display someone's major and year of college
 *
 * @author Brandon Cox
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters:");
        String in = input.nextLine();

        char major = in.charAt(0);
        char level = in.charAt(1);

        String sMajor = "";
        String sLevel = "";

        switch (major) {
            case 'M':
                sMajor = "Mathematics";
                break;

            case 'C':
                sMajor = "Computer Science";
                break;

            case 'I':
                sMajor = "Information Technology";
                break;

            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }

        switch (level) {
            case '1':
                sLevel = "freshman";
                break;

            case '2':
                sLevel = "sophomore";
                break;

            case '3':
                sLevel = "junior";
                break;

            case '4':
                sLevel = "senior";
                break;

            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }
        System.out.println(sMajor + " " + sLevel);
    }

}
