import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter weight in grams: ");
        int grams = scan.nextInt();
        int weight = grams;

        int leiviska = (int) (grams / 8499.2);
        grams = grams % 8512;

        int naula = (int) (grams / 425.6);
        grams = grams % 425;

        double luoti = grams / 13.28 ;


        System.out.printf("%d grams is %d leiviska, %d naula, and %.2f luoti.", weight, leiviska, naula, luoti);
    }
}
