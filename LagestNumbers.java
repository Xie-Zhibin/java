import java.util.ArrayList;
import java.math.*;

public class LagestNumbers {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(45); // Add a integer
        list.add(3445.52); // Add a double
        // Add a BigInteger
        list.add(new BigInteger("3220423904890328593435"));
        // Add a BigDecimal
        list.add(new BigDecimal("230934098504326345090.34598"));

        System.out.println("The largst number is " + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }
        return number;
    }
}