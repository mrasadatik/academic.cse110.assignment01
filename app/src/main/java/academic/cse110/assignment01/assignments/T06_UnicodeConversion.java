package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T06_UnicodeConversion {
    public static void convertCharToUnicode(Scanner scanner) {
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        
        System.out.println("The Unicode for the character " + inputChar + " is " + (int) inputChar);
    }
}
