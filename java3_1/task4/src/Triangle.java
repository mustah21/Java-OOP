public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(double width, double height, String colour) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
       return (width * height)/2;
    }
    @Override
    public String toString() {
        return " triangle with width " + width + ", height " + height + " and color " + getColor();
    }
}
