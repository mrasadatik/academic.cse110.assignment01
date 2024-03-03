package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T08_OrderThreeCities {
    public static void orderAndDisplayCities(Scanner scanner) {
        scanner.nextLine();
        
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();

        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();

        System.out.print("Enter the third city: ");
        String city3 = scanner.nextLine();
        
        String firstCity, secondCity, thirdCity;

        if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0) {
            firstCity = city1;
            if (city2.compareToIgnoreCase(city3) < 0) {
                secondCity = city2;
                thirdCity = city3;
            } else {
                secondCity = city3;
                thirdCity = city2;
            }
        } else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0) {
            firstCity = city2;
            if (city1.compareToIgnoreCase(city3) < 0) {
                secondCity = city1;
                thirdCity = city3;
            } else {
                secondCity = city3;
                thirdCity = city1;
            }
        } else {
            firstCity = city3;
            if (city1.compareToIgnoreCase(city2) < 0) {
                secondCity = city1;
                thirdCity = city2;
            } else {
                secondCity = city2;
                thirdCity = city1;
            }
        }
        
        System.out.println("The three cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity);
    }
}
