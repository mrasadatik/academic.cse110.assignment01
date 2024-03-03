package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasaadatik
 */
public class T04_PointInsideCircle {
    public static void checkPointInsideCircle(Scanner scanner) {
        System.out.print("Enter the x-coordinate of the point: ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the y-coordinate of the point: ");
        double y = scanner.nextDouble();
        
        double distanceSquared = Math.pow(x, 2) + Math.pow(y, 2);
        
        if (distanceSquared <= 10 * 10) {
            System.out.println("(" + x + ", " + y + ") is inside the circle.");
        } else {
            System.out.println("(" + x + ", " + y + ") is outside the circle.");
        }
    }
}
