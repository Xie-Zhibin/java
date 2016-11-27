// @island
// 2016-10-28 19:50:59
import static net.mindview.util.Print.print;


class Art {
    Art() {
        print("Art constructor.");
    }
}

class Drawing extends Art {
    Drawing(int i, double j) {
        print("Drawing constrctor.");
    }

    Drawing(int i) {
        print(i);
    }

    static int test(int i) {
        print("test on Drawing: " + i);
        return 0;
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        super(2);
        Drawing test = new Drawing(1);
        print("Cartoon constrctor.");
    }

    static int test(int i) {
        print("test on Cartoon: " + i);
        return i;
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
        while (true) {
            int i = 0;
            print(i++);
        }
    }
}

