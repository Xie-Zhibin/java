// @island
// 2016-10-21 16:31:01
import static net.mindview.util.Print.*;

class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'x';
        print("1: x.c = " + x.c);
        f(x);
        print("2: x.c = " + x.c);
    }
}
