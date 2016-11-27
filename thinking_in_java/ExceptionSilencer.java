// @island
// 2016-11-19 21:09:07

public class ExceptionSilencer {
    public static void test() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("error");
            return;
        }
    }

    public static void main(String[] args) {
        test();
    }
}
