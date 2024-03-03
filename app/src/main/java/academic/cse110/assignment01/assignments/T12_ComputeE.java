package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T12_ComputeE {
    public static void computeEValues(Scanner scanner) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double eValue = computeE(i);
            System.out.println("e for i = " + i + ": " + eValue);
        }
        
        int userInput;
        
        do {
            System.out.print("Enter the value of i: ");
            userInput = scanner.nextInt();
            if (userInput < 0) {
                System.out.println("Invalid input: i must be a non-negative integer");
            }
        } while (userInput < 0);
        
        double eValue = computeE(userInput);
        System.out.println("e for i = " + userInput + ": " + eValue);
    }
    
    private static double computeE(int i) {        
        double e = 1.0;
        double factorial = 1.0;

        for (int j = 1; j <= i; j++) {
            factorial *= j;
            e += 1.0 / factorial;
        }

        return e;
    }
}
