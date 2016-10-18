import java.math.*;


public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Beijing", "ShangHai", "ShenZhen"};
        java.util.Arrays.sort(cities);
        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {
            new BigInteger("129483290408283809"),
            new BigInteger("234987238947"),
            new BigInteger("2308209840923")
        };
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number: hugeNumbers) {
            System.out.print(number + " ");
        }
    }
}
