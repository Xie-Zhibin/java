public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarysearch(new double[]{1,2,3,4,5,5,16,17,18,19,20}, 20.0));
    }

    public static int binarysearch (double[] list, double key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key > list[mid]){
                low = mid + 1;
            }
            else if (key < list[mid]){
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1; // Not Found
    }
}