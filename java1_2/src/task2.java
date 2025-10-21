//Write a program that asks the user for the lengths of the legs of a right triangle
// and prints the length of the hypotenuse of the triangle.
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the base length of the triangle: ");
    int base = scan.nextInt();

    System.out.print("Enter the height of the triangle: ");
    int height = scan.nextInt();

    double hypotenuse = Math.sqrt((Math.pow(base, 2)) + Math.pow(height, 2));

    System.out.println("The hypotenuse is: %6.2f\n " + hypotenuse);

    }
}
