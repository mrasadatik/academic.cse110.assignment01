package academic.cse110.assignment01.assignments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T03_GameRockPaperScissors {
    public static void playRockPaperScissor(Scanner scanner) {
        scanner.nextLine();
        
        Random random = new Random();
        
        String[] moves = {"scissors", "rock", "paper"};
        
        while (true) {
            System.out.println("Rock Paper Scissors! Let's play!");
            System.out.println("Choose:");
            System.out.println("\t0. Scissors");
            System.out.println("\t1. Rock");
            System.out.println("\t2. Paper");
            System.out.println("\tOr type \"quit\" to EXIT!");

            String userChoice;
            do {
                System.out.print("Enter your choice: ");
                userChoice = scanner.nextLine();
                if (!userChoice.equalsIgnoreCase("quit") && !userChoice.matches("[012]")) {
                    System.out.println("Invalid option. Please choose scissors (0), rock (1), or paper (2), or type \"quit\" to exit.");
                }
            } while (!userChoice.equalsIgnoreCase("quit") && !userChoice.matches("[012]"));

            if (userChoice.equalsIgnoreCase("quit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            int userMove = Integer.parseInt(userChoice);
            
            int computerMove = random.nextInt(3);

            System.out.println("You chose: " + moves[Integer.parseInt(userChoice)]);
            System.out.println("Computer chose: " + moves[computerMove]);
            
            if (userMove == computerMove) {
                System.out.println("It's a tie!");
            } else if ((userMove == 0 && computerMove == 2) ||
                (userMove == 1 && computerMove == 0) ||
                (userMove == 2 && computerMove == 1)) {
                System.out.println("You won!");
            } else {
                System.out.println("You lose.");
            }
        }
    }
}
