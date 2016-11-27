// @island
// 2016-11-19 21:14:10

public class FinallyTest {
    static int a = 1;

    public static void main(String[] args) {
        try {
            System.out.printf("in try, a = %d\n", a);
            a++;
            return;
        } finally {
            System.out.printf("in finally, a = %d\n", a);
        }
    }
}
