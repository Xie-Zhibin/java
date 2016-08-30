
public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
            new ComparableRectangle(2, 3),
            new ComparableRectangle(1, 5),
            new ComparableRectangle(4, 3),
            new ComparableRectangle(2, 4)
        };
        java.util.Arrays.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}