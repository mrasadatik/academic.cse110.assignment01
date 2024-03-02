package academic.cse110.assignment01.assignments;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T02_Lottery {
    public static void getLotteryPrize(Scanner scanner) {
        Random random = new Random();
        int lotteryNumber = random.nextInt(900) + 100;

        int lotteryDigit1 = lotteryNumber / 100;
        int lotteryDigit2 = (lotteryNumber / 10) % 10;
        int lotteryDigit3 = lotteryNumber % 10;

        int userInputtedLotteryNumber;
        System.out.print("Please enter yout 3-digit lottery number: ");
        userInputtedLotteryNumber = scanner.nextInt();

        if (userInputtedLotteryNumber < 100 || userInputtedLotteryNumber > 999) {
            System.out.println("Invalid input. Please enter a 3-digit number.");
            return;
        }

        int userInputtedLotteryDigit1 = userInputtedLotteryNumber / 100;
        int userInputtedLotteryDigit2 = (userInputtedLotteryNumber / 10) % 10;
        int userInputtedLotteryDigit3 = userInputtedLotteryNumber % 10;

        boolean exactMatch = (userInputtedLotteryNumber == lotteryNumber);
        boolean allDigitsMatch =
                (userInputtedLotteryDigit1 == lotteryDigit1 || userInputtedLotteryDigit1 == lotteryDigit2 || userInputtedLotteryDigit1 == lotteryDigit3) &&
                (userInputtedLotteryDigit2 == lotteryDigit1 || userInputtedLotteryDigit2 == lotteryDigit2 || userInputtedLotteryDigit2 == lotteryDigit3) &&
                (userInputtedLotteryDigit3 == lotteryDigit1 || userInputtedLotteryDigit3 == lotteryDigit2 || userInputtedLotteryDigit3 == lotteryDigit3);
        boolean anyDigitMatch =
                (userInputtedLotteryDigit1 == lotteryDigit1 || userInputtedLotteryDigit1 == lotteryDigit2 || userInputtedLotteryDigit1 == lotteryDigit3) ||
                (userInputtedLotteryDigit2 == lotteryDigit1 || userInputtedLotteryDigit2 == lotteryDigit2 || userInputtedLotteryDigit2 == lotteryDigit3) ||
                (userInputtedLotteryDigit3 == lotteryDigit1 || userInputtedLotteryDigit3 == lotteryDigit2 || userInputtedLotteryDigit3 == lotteryDigit3);

        if (exactMatch) {
            System.out.println("Congratulations! You won the grand prize of $10,000!");
        } else if (allDigitsMatch) {
            System.out.println("Congratulations! You won $3,000! All digits match.");
        } else if (anyDigitMatch) {
            System.out.println("You won $1,000! At least one digit matches.");
        } else {
            System.out.println("Sorry, no match this time. Better luck next time!");
        }

        System.out.println("The winning number was: " + lotteryNumber);
    }
}
