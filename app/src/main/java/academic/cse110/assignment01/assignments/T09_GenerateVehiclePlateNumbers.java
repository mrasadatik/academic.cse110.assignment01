package academic.cse110.assignment01.assignments;

/**
 *
 * @author mrasadatik
 */
public class T09_GenerateVehiclePlateNumbers {
    public static void generatePlateNumber() {
        String plateNumber = "";
        for (int i = 0; i < 3; i++) {
            char randomLetter = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
            plateNumber += randomLetter;
        }
        
        for (int i = 0; i < 4; i++) {
            int randomDigit = (int) (Math.random() * 10);
            plateNumber += randomDigit;
        }
        
        System.out.println("Generated Plate Number: " + plateNumber);
    }
}
