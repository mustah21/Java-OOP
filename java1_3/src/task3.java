import java.util.Scanner;
import java.lang.Math;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive integer");
        int start = scan.nextInt();

        System.out.println("Enter your second positive integer");
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " is a prime number");

            }
        }
    }
}
