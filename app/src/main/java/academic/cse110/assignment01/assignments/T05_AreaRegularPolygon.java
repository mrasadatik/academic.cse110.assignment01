package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T05_AreaRegularPolygon {
    public static void calculatePolygonArea(Scanner scanner) {
        int n;
        double s;
        
        do {
            System.out.print("Enter the number of sides: ");
            n = scanner.nextInt();
            if (n < 3) {
                System.out.println("Invalid: The number of sides must be greater than or equal to 3.");
            }
            if (n % 180 == 0) {
                System.out.println("Invalid: The formula involves division by zero. Please choose a different number of sides.");
            }
        } while(n < 3 || (n % 180 == 0));
        
        do {
            System.out.print("Enter the side: ");
            s = scanner.nextDouble();
            if (s <= 0) {
                System.out.println("Invalid: The side length must be greater than 0.");
            }
        } while(s <= 0);
        
        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
        
        System.out.println("The area of the polygon is " + area);
    }
}
