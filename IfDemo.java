package learnJava;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        if ((number % 5) == 0){
            System.out.println("Hi!Five.");
        }

        else if (number % 2 == 0){
            System.out.println("Hi!Even.");
        }
        if (true ^ true)
            System.out.println("fsadfasdf");
    }
}
