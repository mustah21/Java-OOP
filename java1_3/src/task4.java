import java.util.Scanner;
import java.lang.Math;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        while (score < 10) {
            for (int i = 0; i < 10; i++) {
                int one = (int) (Math.random() * 10) + 1;
                int two = (int) (Math.random() * 10) + 1;

                System.out.println("Problem " + (i + 1) + ": " + one + " * " + two + " = ");
                int result = scan.nextInt();
                if (result == (one * two)) {
                    System.out.println("Correct");
                    score++;
                } else {
                    System.out.println("Incorrect");
                }
            }
            if (score == 10) {
                System.out.println("Good job you may exit! ");
            } else {
                System.out.println("You scored: " + score + " points" + ", please start again.");
                score = 0;
            }

        }
    }
}