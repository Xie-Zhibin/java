
public class TestGeometricObject {
    public static void main(String[] args) {
        // Create two geometric objects
        GeometricObject geoObj1 = new Circle(5);
        GeometricObject geoObj2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " +
                           equalArea(geoObj1, geoObj2));

        // Display circle
        displayGeometricObject(geoObj1);

        // Display rectangle
        displayGeometricObject(geoObj2);
    }

    // A method for comparing the areas of two geometric objects
    public static boolean equalArea(GeometricObject obj1,
                                    GeometricObject obj2) {
        return obj1.getArea() == obj2.getArea();
    }

    // A method for displaying a geometric object
    public static void displayGeometricObject(GeometricObject obj) {
        System.out.println();
        System.out.println("The area is: " + obj.getArea());
        System.out.println("The perimeter is: " + obj.getPerimeter());
    }
}