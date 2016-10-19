
public class Test{
    private static int i = 0, j = 0;
    public static void main(String[] args){
        int i = 2, k = 3;
        {
            int j = 3;
            System.out.println("i + j is: " + (i + j));
            System.out.println("j = " + j);
        }

        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }
}