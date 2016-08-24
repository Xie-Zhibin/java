import java.util.Scanner;

public class InputParc {
    public static void main(String[] args) {
        final double PI = 3.141592654;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int integer = input.nextInt();
        System.out.println("The number is:" + integer);
        // ---I'm a beautiful cutting line---
        System.out.println("Enter a double:");
        double num = input.nextDouble();
        System.out.println("The double is:" + num);
        // ---I'm a beautiful cutting line---
        System.out.println(Math.pow(integer, num));
        // ---I'm a beautiful cutting line---
        input.nextLine(); // in order to catch the '\n' leaving by nextInt.
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.println("The string is:" + str);
        // ---I'm a beautiful cutting line---
        double a = 2.435E2;
        System.out.println("done");
    }
}
