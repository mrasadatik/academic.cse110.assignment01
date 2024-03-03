package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T07_HexToBinary {
    public static void convertAndDisplayBinary(Scanner scanner) {
        System.out.print("Enter a hex digit: ");
        char hexDigit = scanner.next().charAt(0);
        
        int decimalValue = Character.digit(hexDigit, 16);
        String binaryValue = Integer.toBinaryString(decimalValue);
        
        System.out.println("The binary value is " + binaryValue);
    }
}
