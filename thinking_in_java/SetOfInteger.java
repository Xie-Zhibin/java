// @island
// 2016-11-10 09:04:01
import java.util.*;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random();
        SortedSet<Integer> intset = new TreeSet<Integer>();
        for (int i=0; i < 10000; i++) {
            intset.add(rand.nextInt(30));
        }
        System.out.println(intset);
    }
}

