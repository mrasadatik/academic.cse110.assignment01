package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T15_ComputeMeanAndStandardDeviation {
    public static void calculateStatistics(Scanner scanner) {
        double sum = 0;
        double sumOfSquares = 0;
        
        System.out.println("Enter ten numbers:");
        
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        for (double number : numbers) {
            sum += number;
        }
        double mean = sum / numbers.length;
        System.out.println("Mean: " + mean);

        for (double number : numbers) {
            sumOfSquares += Math.pow((number - mean), 2);
        }
        if (numbers.length - 1 == 0) {
            System.out.println("Division by zero. Unable to calculate standard deviation.");
            System.out.println("Exiting...");
            return;
        }
        double standardDeviation = Math.sqrt(sumOfSquares / (numbers.length - 1));
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}
