import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        // Create a new Scanner
        Scanner input = new Scanner(System.in);

        // Enter annual interest
        System.out.println("Enter annual interest rate, e.g. 8.25: ");
        double annualInterestRate = input.nextDouble();

        // Enter number of years
        System.out.println("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        // Enter loan amount
        System.out.println("Enter loan amount, e.g. 12000.2: ");
        double loanAmount = input.nextDouble();

        // Create a Loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" +
                          "The monthly payment is %.2f\nThe total payment is %.2f\n",
                          loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                          loan.getTotalPayment());
    }
}
