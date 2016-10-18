import java.util.Scanner;


public class ComputeFactorialTailRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();
        System.out.println(factorial(n));
    }

    private static long factorial(int n) {
        return factorial(n, 1);
    }

    private static long factorial(int n, int result) {
        if (n == 0) {
            return result;
        } else {
            return factorial(n - 1, n * result);
        }
    }
}