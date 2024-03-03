package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T14_BitLevelOperations {
    public static void showBits(Scanner scanner) {
        short number;
        
        System.out.print("Enter a short integer: ");
        number = scanner.nextShort();
        
        System.out.print("The bits are ");
        for (int i = 15; i >= 0; i--) {
            int bit = (number >> i) & 1;
            System.out.print(bit);
        }
        System.out.println();
    }
}
