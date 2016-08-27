
public class TestCircleWithCustomException {
    public static void main(String[] args){
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        }
        catch (InvalidRadiusException e) {
            System.out.println(e);
        }

        System.out.println("Number of objects created: " +
            CircleWithCustomException.getNumberOfObjects());
    }
}

// Construct a circle with a specified radius
public class CircleWithCustomException() {
    // The radius of the circle
    private double radius;

    // The number ofobjects created
    private static int numberOfObjects = 0;

    // Construct a circle with radius 1
    public CircleWithCustomException(double newRadius)
    throws InvalidRadiusException {
        setRadius(newRadius);
    }
}