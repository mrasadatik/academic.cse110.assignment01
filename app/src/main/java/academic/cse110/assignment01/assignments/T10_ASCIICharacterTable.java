package academic.cse110.assignment01.assignments;

/**
 *
 * @author mrasadatik
 */
public class T10_ASCIICharacterTable {
    final private static int CHAR_PER_LINE = 10;
    public static void displayASCIICharacterTable() {
        for (char ch = '!'; ch <= '~'; ch++) {
            System.out.print(ch);
            
            if ((ch - '!') % CHAR_PER_LINE == CHAR_PER_LINE - 1) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
        }
    }
}
