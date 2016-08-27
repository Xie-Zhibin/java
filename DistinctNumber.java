import java.util.ArrayList;
import java.util.Scanner;


public class DistinctNumber {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0) ");
        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0) {
                list.add(value); // Add the value from the input
            }
        } while (value != 0);

        // Display the distinct numbers
        System.out.println("The list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }
}
