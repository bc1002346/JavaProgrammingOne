package Chapter6;

import java.util.Scanner;

/**
 * Program to display if a password is valid
 *
 * @author Brandon Cox
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        // Display Valid Password if rules are followed, Invalid Password otherwise
        System.out.println(
                (isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
    }

    /**
     * Method isPasswordVaild tests whether a string is a valid password
     *
     * @param password the string you enter for a password
     * @return if the password is valid
     */
    public static boolean isValidPassword(String password) {
        final int LENGTH_OF_VALID_PASSWORD = 8;	// Valid length of password
        final int MINIMUM_NUMBER_OF_DIGITS = 2;	// Minimum digits it must contain

        boolean validPassword
                = isLengthValid(password, LENGTH_OF_VALID_PASSWORD)
                && isOnlyLettersAndDigits(password)
                && hasNDigits(password, MINIMUM_NUMBER_OF_DIGITS);

        return validPassword;
    }

    /**
     * Method isLengthValid tests whether a string is a valid length
     *
     * @param password the string you enter for a password
     * @param validLength the length that is allowed on the password
     * @return if the password length is valid
     */
    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }

    /**
     * Method isOnlyLettersAndDigits tests if a string contains only letters and
     * digits
     *
     * @param password the string you enter for a password
     * @return if a character is a digit or a letter
     */
    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method hasNDigits tests if a string contains at least n digits
     *
     * @param password the string you enter for a password
     * @param n the number of digits the password should have
     * @return if the number of digits is correct
     */
    public static boolean hasNDigits(String password, int n) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
            if (numberOfDigits >= n) {
                return true;
            }
        }
        return false;
    }

}
