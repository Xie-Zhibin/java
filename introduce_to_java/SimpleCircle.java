/***********************************
File Name: SimpleCircle.java
Author: island
Email: 1159401236@qq.com 
Created Time: 2016年08月25日 星期四 15时45分06秒
***********************************/
public class SimpleCircle {
    // Main method
    public static void main(String[] args) {
        // Create a circle with radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + 
                circle1.radius + "is " + circle1.getArea());

        //Create a circle with radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + 
                circle2.radius + " is " + circle2.getArea());

        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + 
                circle2.radius + " is " + circle2.getArea());
    }

    double radius;

    // Construct a circle with radius 1
    SimpleCircle() {
        radius = 1;
    }

    // Construct a circle with a specified radius
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    // Return the area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }

    // Return the perimeter of this circle
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Set a new radius for this circle
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
