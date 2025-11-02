public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height, String colour) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "rectangle width " + width + ", height " + height + " and color " + getColor();
    }
}
