package academic.cse110.assignment01;

import java.util.Scanner;
import academic.cse110.assignment01.assignments.T01_RandomMonth;
import academic.cse110.assignment01.assignments.T02_Lottery;
import academic.cse110.assignment01.assignments.T03_GameRockPaperScissors;
import academic.cse110.assignment01.assignments.T04_PointInsideCircle;
import academic.cse110.assignment01.assignments.T05_AreaRegularPolygon;
import academic.cse110.assignment01.assignments.T06_UnicodeConversion;
import academic.cse110.assignment01.assignments.T07_HexToBinary;
import academic.cse110.assignment01.assignments.T08_OrderThreeCities;
import academic.cse110.assignment01.assignments.T09_GenerateVehiclePlateNumbers;
import academic.cse110.assignment01.assignments.T10_ASCIICharacterTable;
import academic.cse110.assignment01.assignments.T11_CompareLoans;

public class App {
    public static void main(String[] args) {
        try (Scanner cliInput = new Scanner(System.in)) {
            int assignmentChoice;
            
            System.out.println();
            System.out.println("Assignment\t: 01");
            System.out.println("\tSubmitted to\t: Ahmed Abdal Shafi Rasel (AASR), Lecturer, Department of CSE");
            System.out.println();
            System.out.println("Name\t\t: Md Asaduzzaman Atik");
            System.out.println("Student ID\t: 2023-1-60-130");
            System.out.println("Couse title\t: Object Oriented Programming");
            System.out.println("Couse code\t: CSE110");
            System.out.println("Section\t\t: 16");
            System.out.println("Semester\t: Spring 2024");
            
            do {
                System.out.println();
                System.out.println();
                System.out.println("Choose an assignment number to explore:");
                System.out.println("\t1. Random month");
                System.out.println("\t2. Lottery");
                System.out.println("\t3. Game - Rock, Paper, Scissors");
                System.out.println("\t4. Point Inside Circle");
                System.out.println("\t5. Area of a Regular Polygon");
                System.out.println("\t6. Unicode Conversion");
                System.out.println("\t7. Hex to Binary");
                System.out.println("\t8. Order Three Cities");
                System.out.println("\t9. Generate Vehicle Plate Numbers");
                System.out.println("\t10. Display the ASCII Character Table");
                System.out.println("\t11. Financial Application: Compare Loans");
                
                System.out.println("\t0. Exit");
                System.out.print("\nEnter your choice: ");
                
                assignmentChoice = cliInput.nextInt();
                
                System.out.println();
                System.out.println();
                
                switch(assignmentChoice) {
                    case 1 -> T01_RandomMonth.getRandomMonth();
                    case 2 -> T02_Lottery.lotteryPrize(cliInput);
                    case 3 -> T03_GameRockPaperScissors.playRockPaperScissor(cliInput);
                    case 4 -> T04_PointInsideCircle.checkPointInsideCircle(cliInput);
                    case 5 -> T05_AreaRegularPolygon.calculatePolygonArea(cliInput);
                    case 6 -> T06_UnicodeConversion.convertCharToUnicode(cliInput);
                    case 7 -> T07_HexToBinary.convertHextToBinary(cliInput);
                    case 8 -> T08_OrderThreeCities.orderCities(cliInput);
                    case 9 -> T09_GenerateVehiclePlateNumbers.generatePlateNumber();
                    case 10 -> T10_ASCIICharacterTable.displayASCIICharacterTable();
                    case 11 -> T11_CompareLoans.compareLoans(cliInput);
                    case 0 -> {
                        System.out.println("Exiting the program...");
                        break;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
                
            } while (assignmentChoice != 0);
        }
    }
}
