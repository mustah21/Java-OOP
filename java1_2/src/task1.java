//Fahrenheit to Celsius Converter
// Write a program that prompts the user to enter a temperature in Fahrenheit and converts it to Celsius.
// Display the converted temperature on the console with one decimal place.
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter your temperature in farhrenheit: ");
    double temperature = scanner.nextDouble();

    double degree = ((temperature - 32) * (5.0/9.0));
        System.out.printf("Your temperature in degrees is: %6.2f\n ", degree);
        }
    }
