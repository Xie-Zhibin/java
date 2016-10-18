
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    // Default Constructor
    public Loan() {
        this(2.5, 1, 10000);
    }

    // Construct a loan with specified annual interest rate
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    // Return annualInterestRate
    public double getInterestRate() {
        return annualInterestRate;
    }

    // Set a new annaulInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Return number of years
    public int getNumberOfYears() {
        return numberOfYears;
    }

    // Set a new numberOfYears
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // Find monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    // Find total payment
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    // Return loan date
    public java.util.Date getLoanDate() {
        return loanDate;
    }
}
