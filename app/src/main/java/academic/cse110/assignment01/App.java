package academic.cse110.assignment01;

import java.util.Scanner;
import academic.cse110.assignment01.assignments.T01_RandomMonth;
import academic.cse110.assignment01.assignments.T02_Lottery;
import academic.cse110.assignment01.assignments.T03_GameRockPaperScissors;

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
                
                System.out.println("\t0. Exit");
                System.out.print("\nEnter your choice: ");
                
                assignmentChoice = cliInput.nextInt();
                
                System.out.println();
                System.out.println();
                
                switch(assignmentChoice) {
                    case 1 -> {
                        String[] t01_randomMonth = T01_RandomMonth.getRandomMonth();
                        int t01_selectedRandomNumber = Integer.parseInt(t01_randomMonth[0]);
                        String t01_monthFromRandomNumber = t01_randomMonth[1];
                        
                        System.out.println("The corresponding month name for the randomly generated number \"" + t01_selectedRandomNumber + "\" is \"" + t01_monthFromRandomNumber + "\"");
                    }
                    case 2 -> T02_Lottery.getLotteryPrize(cliInput);
                    case 3 -> T03_GameRockPaperScissors.playRockPaperScissor(cliInput);
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
