public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {12, 324, 45, 576, 78, 34, 231, 4, 34};
        int key = 12;
        System.out.println(search(list, key));
    }

    public static int search(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }
}