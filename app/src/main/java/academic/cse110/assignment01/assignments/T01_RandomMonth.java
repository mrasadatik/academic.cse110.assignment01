package academic.cse110.assignment01.assignments;

/**
 *
 * @author mrasadatik
 */
public class T01_RandomMonth {
    public static String[] getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int randomIndex = (int) (Math.random() * months.length);
        String[] result = {String.valueOf(randomIndex + 1), months[randomIndex]};
        
        return result;
    }
}
