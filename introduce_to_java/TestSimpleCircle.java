
public class TestSimpleCircle {
    /** Main method*/
    public static void main(String[] args) {
        // Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();

        // Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);

        // Create a circle with radius 125
        SimpleCircle circle3 = new SimpleCircle(125);

        // Modify circle radius
        circle1.radius = 100; // or circle1.setRadius(100)
        System.out.println("The area of the circle of radius " +
                           circle1.radius + " is " + circle1.getArea());
        java.util.Date date = new java.util.Date();
        System.out.println(date);
    }
}

class SimpleCircle {
    double radius;

    SimpleCircle() { // Constructor
        radius = 1;
    }

    SimpleCircle(double newRadius) { // Constructor
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}