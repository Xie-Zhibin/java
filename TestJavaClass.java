/***********************************
File Name: TestJavaClass.java
Author: island
Email: 1159401236@qq.com 
Created Time: 2016年08月25日 星期四 17时05分08秒
***********************************/
import java.util.Random;

public class TestJavaClass {
    public static void main(String[] args) {
        // test Date
        java.util.Date date = new java.util.Date();
        System.out.println("The elapsed time since Jan 1, 1970 is " +
                date.getTime() + " millisecond");
        System.out.println(date.toString());

        // test Random
        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(random1.nextInt(1000) + " ");
        }

        Random random2 = new Random();
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(random2.nextInt(1000) + " ");
        }
        System.out.println("");
    }
}
