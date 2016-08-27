import java.util.Scanner;


public class Quotient {
    // System.out.println("float divise:" + (12.3 / 0));
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.println("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            double result = quotient(number1, number2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e + "\nTry again!");
        }
    }

    public static double quotient(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        } else {
            return a / b;
        }
    }
}
