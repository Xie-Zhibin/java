// @island
// 2016-11-06 10:52:18

public class DotNew {
    public class Inner {
        void out() {
            System.out.println("Inner.out()");
        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
        dni.out();
    }
}

