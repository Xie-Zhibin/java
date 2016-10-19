import java.util.ArrayList;
import java.util.Scanner;


public class TestArrayList {
    // Main method
    public static void main(String[] args){
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities in the cities
        cityList.add("London");
        cityList.add("London");
        cityList.add("BeiJing");

        System.out.println("List size? " +
            cityList.size());
        System.out.println("Is Miami in the list " +
            cityList.contains("Miami"));
        System.out.println("Is the list empty " +
            cityList.isEmpty());
        cityList.remove("London");
        System.out.println("cityList size: " + cityList.size());
        System.out.println(cityList);

        // Create a integer list
        ArrayList<Integer> list = new ArrayList<>();
        // Create a scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a int: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        list.add(20);
        list.add(0);
        list.remove(0);
        System.out.println(list.toString());
        System.out.println("sadf" * 2);
    }
}
