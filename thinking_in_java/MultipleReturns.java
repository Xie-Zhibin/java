// @island
// 2016-11-19 21:00:06
import static net.mindview.util.Print.*;

public class MultipleReturns {
    public static void f(int i) {
        print("Initialization that requires cleanup");
        try {
            print("Point 1");
            if (i == 1) return;
            print("Point 2");
            if (i == 2) return;
            print("Point 3");
            if (i == 3) return;
            print("End");
            return;
        } finally {
            print("Performing cleanup");
        }
    }

    public static void main(String[] args) {
        for (int i=1;i<=2;i++) {
            f(i);
        }
    }
} 

