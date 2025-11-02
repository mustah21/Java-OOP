public class Circle extends Shape {

    private double radius;

    public Circle(int radius , String colour) {
        super(colour);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "circle with radius " + radius + " and color " + getColor();
    }
}
