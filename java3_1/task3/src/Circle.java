import java.lang.Math;

public class Circle extends Shape {

    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Area of circle with radius: " + radius + ": ";
    }
}
