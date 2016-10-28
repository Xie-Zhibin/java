// @island
// 2016-10-21 17:31:00
import java.util.*;
import static net.mindview.util.Print.*;

public class MathOps {
    public static void main(String[] args) {
        // Create a seeded random number generator
        Random rand = new Random(47);
        int i, j, k;
        // Choose value form 1 to 100
        j = rand.nextInt(100) + 1;
        print("j = " + j);
        k = rand.nextInt(100) + 1;
        print("k = " + k);
        i = j + k;
        print("j + k = " + i);
        i = j - k;
        print("j - k = " + i);
        i = k / j;
        print("j / k = " + i);
        print("k * j = " + (k * j));
        print("k % j = " + (k % j));
    }
}
