package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T13_DecimalToOctal {
    public static void convertDecimalToOctal(Scanner scanner) {
        int decimalNumber;
        String octalValue = "";
        
        do {
            System.out.print("Enter a decimal integer: ");
            decimalNumber = scanner.nextInt();
            if (decimalNumber < 0) {
                System.out.println("Invalid: Please enter a non-negative decimal integer.");
            }
        } while (decimalNumber < 0);
        
        if (decimalNumber == 0) {
            octalValue = "0";
        } else {
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 8;
                octalValue = remainder + octalValue;
                decimalNumber /= 8;
            }
        }
        
        System.out.println("The octal value is: " + octalValue);
    }
}
