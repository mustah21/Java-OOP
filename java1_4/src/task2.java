import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        if (size > 0) {
            for (int i = 0; i < size; i++) {
                System.out.println("Enter integer:");
                numbers[i] = scan.nextInt();
                }
            int maxSum = numbers[0];
            int maxStart = 0;
            int maxEnd = 0;

            for (int start = 0; start < size; start++) {
                int sum = 0;
                for (int end = start; end < size; end++) {
                    sum += numbers[end];
                    if (sum > maxSum) {
                        maxSum = sum;
                        maxStart = start; // for corresponding indices
                        maxEnd = end;     // for corresponding indices
                    }
                }
            }
            System.out.println("Maximum sum: " + maxSum);
            System.out.println("Integers: " + (maxStart + 1) + " to " + (maxEnd + 1));

        }
    }
}
