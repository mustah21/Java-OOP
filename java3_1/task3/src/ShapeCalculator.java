
public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = { new Triangle(7, 4), new Rectangle(5,5), new Circle(3) };

        int i = 1;
        for (Shape areas : shapes) {
            System.out.printf("%s %.2f%n ", areas.toString(), areas.calculateArea());
            i++;
        }
    }
}
