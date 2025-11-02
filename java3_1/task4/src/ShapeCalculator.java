
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = { new Triangle(7,4, "Purple" ),
                new Rectangle(5,5, "Green"),
                new Circle(3, "Yellow") };

        int i = 1;
        for (Shape areas : shapes) {
            System.out.printf("Area of %s: %.2f%n", areas.toString(), areas.calculateArea());
            i++;
        }
    }
}
