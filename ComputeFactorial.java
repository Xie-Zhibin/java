import java.util.Scanner;


public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nonegative integer: ");
        Long n = input.nextLong();

        // Display factorial
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static long factorial(Long n) {
        if (n == 0) {
            return 1;
        } else {
            System.out.println(n);
            return n * factorial(n - 1);
        }
    }
}
