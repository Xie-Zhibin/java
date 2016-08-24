import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 6 % 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.printf("What's %d + %d ?", number1, number2);
        int answer = input.nextInt();
        if (number1 + number2 == answer){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        System.out.printf("What's %d + %d = %d is %b", number1, number2, answer, (number1 + number2 == answer));

    }
}
