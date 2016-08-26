import java.math.*;

public class LargeFactorial {
    public static void main(String[] args){
        System.out.println("5! is\n" + factorial(5));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        StringBuilder strBuilder = new StringBuilder(32);
        strBuilder.append("Hello, world!");
        System.out.println(strBuilder.toString());
        strBuilder.trimToSize();
        System.out.println("Capacity: " + strBuilder.capacity());
        return result;
    }
}
