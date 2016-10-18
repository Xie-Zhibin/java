public class TestCircleWithStaticMembers {
    public static void main(String[] args){
        System.out.println("Before creating object: " +
            CircleWithStaticMembers.numberOfObjects);

        // Create c1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers(-4);
        System.out.println("Now, it become: " +
            CircleWithStaticMembers.numberOfObjects);
    }
}
