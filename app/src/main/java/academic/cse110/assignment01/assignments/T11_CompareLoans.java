package academic.cse110.assignment01.assignments;

import java.util.Scanner;

/**
 *
 * @author mrasadatik
 */
public class T11_CompareLoans {
    public static void compareLoans(Scanner scanner) {
        System.out.print("Loan Amount: ");
        double loanAmount = scanner.nextDouble();
        
        System.out.print("Number of Years: ");
        int numberOfYears = scanner.nextInt();
        
        System.out.println("Interest Rate\t\tMonthly Payment\t\tTotal Payment");
        
        for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125) {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfYears * 12));
            
            double totalPayment = monthlyPayment * numberOfYears * 12;
            
            System.out.printf("%.3f%%\t\t\t%.2f\t\t\t%.2f\n", annualInterestRate, monthlyPayment, totalPayment);
        }
    }
}
