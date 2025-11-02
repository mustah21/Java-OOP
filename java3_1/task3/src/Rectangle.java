public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return height * width;
    }
    @Override
    public String toString() {
        return "Area of circle rectangle width " + width + " and height " + height + ": ";
    }
}
