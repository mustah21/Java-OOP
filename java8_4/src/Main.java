import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for  (int i = 0; i < numbers.length; i++) {
            numbers[i] = i; // sum always
        }

        int count = Math.toIntExact(Arrays.stream(numbers).count());
        int totalSum = Arrays.stream(numbers).sum();
        double average = (double) totalSum / count;
        System.out.println("Mean: " + average);

    }

}