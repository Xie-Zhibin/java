
public class CircleWithException {
    // The radius of the circle
    private double radius;

    // The number of the objects created
    private static int numberOfObjects = 0;

    // Construct a circle with radius 1
    public CircleWithException() {
        this(1.0);
    }

    // Construct a circle with a specified radius
    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    // Retrun radius
    public double getRadius() {
        return radius;
    }

    // Set a new radius
    public void setRadius(double radius)
    throws IllegalArgumentException {
        if (radius >= 0 ) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius can't be negative");
        }
    }

    // Return numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Return the area of this circle
    public double findArea() {
        return radius * radius * Math.PI;
    }
}