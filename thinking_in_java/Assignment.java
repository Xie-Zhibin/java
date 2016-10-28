// @island
// 2016-10-21 16:23:11
// Assingment with objects is a bit tricky
import static net.mindview.util.Print.*;

class Tank {
    int level;
}

public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 12;
        print("1: t1.level = " + t1.level + ", t2.level = " + t2.level);
        t1 = t2;
        print("2: t1.level = " + t1.level + ", t2.level = " + t2.level);
        t1.level = 29;
        print("3: t1.level = " + t1.level + ", t2.level = " + t2.level);
    }
}
