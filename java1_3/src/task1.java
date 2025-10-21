//Write a program that prompts the user to enter the coefficients of a
// quadratic equation (ax^2 + bx + c = 0) and calculates its roots using the quadratic formula.
// Display the roots on the console.
// If the equation has no real roots, display the message "No real roots".

import java.util.Scanner;
import java.lang.Math;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first coefficient as (x^2): ");
        double a = scan.nextDouble();

        System.out.println("please enter your second coefficient as (x): ");
        double b = scan.nextDouble();

        System.out.println("please enter your third coefficient as (constant): ");
        double c = scan.nextDouble();

        double discriminant = b * b - (4 * a * c);
        //System.out.println(discriminant);

        if (a < 0) {
            System.out.println("Error enter numbers above 0");
            return;
        }

        if (discriminant > 0 ) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.print("The quadratic roots of your given coefficients are: " + root1 + " and " + root2);
        } else {
            System.out.println("no real roots exist");
        }

    }
}