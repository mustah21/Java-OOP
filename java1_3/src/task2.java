
//Write a program that prompts the user to enter a binary number
// (composed of 0s and 1s) and converts it to decimal.
// Display the decimal equivalent on the console.

import java.util.Scanner;
import java.lang.Math;

public class task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the binary number you want to change to decimal: ");
        String binary = scan.nextLine();
        int decimal_sum = 0;

        for (int i = 0; i < binary.length(); i++) {
            if  (binary.charAt(i) == '1') {
                double conversion = Math.pow(2, (binary.charAt(i) - '0' + i - 1)); // Tried different things this one worked
                // System.out.println(conversion + " ,"  + binary.charAt(i) + " ," + (i - 1) + " , " + (binary.charAt(i) - '0' + i - 1));
                decimal_sum += conversion;
            }
        }
        System.out.println("The decimal sum is: " + decimal_sum);
    }
}
