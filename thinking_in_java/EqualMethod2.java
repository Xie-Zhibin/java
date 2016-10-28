// @island
// 2016-10-21 19:23:58
// default equals() dose not compare contents.

class Value {
    int i;
}

public class EqualMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
    }
}
