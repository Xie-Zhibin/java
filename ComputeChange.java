public class ComputeChange {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, e.g. 11.56: ");
        double amount = input.nextDouble();

        // Transfer to pennies, (int)
        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int dollars = remainingAmount / 100;

        // Remaining Amount
        remainingAmount %= 100;

        // Find the number of quarters in the remaining amount
        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        // Find the number of dimes in the remaning amount
        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        // Find the number of nickls in the remaning amount
        int nickls = remainingAmount / 5;
        remainingAmount %= 5;

        // Find the number of pennies in the remaning amount
        int pennies = remainingAmount;

        // Show the results
        System.out.println("Your amount " + amount + " consists of ");
        System.out.printf("%d dollars%n" + "%d quarters%n%d dimes%n" + "%d nickels%n" + "%d pennies", dollars, quarters,
                dimes, nickls, pennies);
    }
}
