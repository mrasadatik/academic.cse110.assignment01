package academic.cse110.assignment01.assignments;

/**
 *
 * @author mrasadatik
 */
public class T01_RandomMonth {
    public static void getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int randomIndex = (int) (Math.random() * months.length);
        
        System.out.println("The corresponding month name for the randomly generated number \"" + (randomIndex + 1) + "\" is \"" + months[randomIndex] + "\"");
    }
}
