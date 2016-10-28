// @island
// 2016-10-22 14:36:09

public class Casting {
    public static void main(String[] args) {
        int i = 100;
        long lng = (long)i;
        lng = i;
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;
        System.out.println(i);
        System.out.println(lng);
    }
}
