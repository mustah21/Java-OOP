package Task2;

import java.util.ArrayList;

public class Numbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers;

        numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10) + 1);

        }
        System.out.println("List for reference: " + numbers);

        int[] totalSum = {0};
        numbers.forEach(n -> {
            if (n % 2 != 0) {
                int i = n *2;
                totalSum[0] += i;
            }
        });
        System.out.println("Total sum without even numbers: " + totalSum[0]);

//        int[] evenSum = {0};
//        numbers.forEach(n -> {
//            if (n % 2 == 0) {
//                evenSum[0] += n;
//            }
//        });
//        System.out.println("Even sum: " + evenSum[0]);
//        System.out.println("\n------------\n");
//        numbers.replaceAll(n -> {
//            int i = 0;
//            if (n % 2 != 0) {
//                i = n * 2;
//                System.out.println("Original number : " + n + "   Multiplied number: " + i);
//            }
//            return i;
//        });
//
//        int[] sum = {0};
//        numbers.forEach( n -> {
//            sum[0] += n;
//        });
//
//        System.out.println("\n------------\n");
//        System.out.println("Total sum: " + sum[0]);

    }
}
