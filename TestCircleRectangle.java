
public class TestCircleRectangle {
    public static void main(String[] args){
        CircleFromSimpleGeometricObject circle =
        new CircleFromSimpleGeometricObject(10, "blue", true);
        System.out.println("A circle: " + circle.toString());
        System.out.println("The color is: " + circle.getColor());
        System.out.println("The radiuds is: " + circle.getRadius());
        System.out.println("The area is: " + circle.getArea());

        System.out.println("---------------------");

        RectangleFromSimpleGeometricObject rectangle =
        new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("A rectangle: " + rectangle.toString());
    }
}
