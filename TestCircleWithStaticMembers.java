public class TestCircleWithStaticMembers {
    public static void main(String[] args){
        System.out.println("Before creating object: " +
            CircleWithStaticMembers.numberOfObjects);

        // Create c1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();
        System.out.println("Now, it become: " +
            CircleWithStaticMembers.numberOfObjects);
        int num = 12;
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int e: arr) {
            System.out.print(e);
        }
    }
}
