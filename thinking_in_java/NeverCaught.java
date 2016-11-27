// @island
// 2016-11-19 20:49:33
public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        System.out.println("Error.");
//        g();
        System.out.println("done");
    }
}
