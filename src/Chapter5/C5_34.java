package Chapter5;

import java.util.Scanner;

/**
 * Program to display rock, paper, scissors
 *
 * @author Brandon Cox
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerWins,
                userWins;
        computerWins = userWins = 0;
        do {

            int computer = (int) (Math.random() * 3);

            System.out.print("scissor (0), rock(1), paper (2): ");
            int user = input.nextInt();

            System.out.print("The computer is ");
            switch (computer) {
                case 0:
                    System.out.print("scissor.");
                    break;
                case 1:
                    System.out.print("rock.");
                    break;
                case 2:
                    System.out.print("paper.");
                    break;
            }

            System.out.print(" You are ");
            switch (user) {
                case 0:
                    System.out.print("scissor");
                    break;
                case 1:
                    System.out.print("rock");
                    break;
                case 2:
                    System.out.print("paper");
                    break;
                default:
                    System.out.println(
                            "disqualified for entering an invalid number.");
                    System.exit(1);
            }

            // Display result 
            if (computer == user) {
                System.out.println(" too, It is a draw");
            } else {
                boolean win = (user == 0 && computer == 2)
                        || (user == 1 && computer == 0)
                        || (user == 2 && computer == 1);
                if (win) {
                    System.out.println(". You won");
                    computerWins++; // Increment computer wins
                } else {
                    System.out.println(". You lose");
                    userWins++;		// Increment user wins
                }

            }
            // Print Score
            System.out.println("Computer wins: " + computerWins
                    + "\nUser wins: " + userWins);

            // If either the user or the computer wins  
            // are less than or equal to 2 continue play.
        } while (Math.abs(computerWins - userWins) <= 2);
    }

}
