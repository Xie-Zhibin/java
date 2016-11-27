// @island
// 2016-11-06 13:19:31
public interface ClassInterface {
    void howdy();
    class Test implements ClassInterface {
        public void howdy() {
            System.out.prinlt("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
