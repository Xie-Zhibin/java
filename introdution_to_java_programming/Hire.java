public class Hire {
    public static void main(String[] args){
        System.out.println(12);
    }

    public static double haha = 12;
    private double radius;

    Hire() {
        this(1);
    }

    Hire(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}
