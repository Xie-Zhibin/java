
public class TestCircleWithException {
    // Main method
    public static void main(String[] args){
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(6);
            CircleWithException c3 = new CircleWithException(-23);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("hahahhah");
        }

        System.out.println("Number of object created: " +
            CircleWithException.getNumberOfObjects());
    }
}