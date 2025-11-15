package ignore;


import java.util.Random;

public class Array extends Thread {

    static int[] numbers = new int[100000];
    long sum = 0;
    private int startIndex;
    private int endIndex;
    Random rand = new Random();
    public Array(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            sum += numbers[i];
        }
//        System.out.println("Sum" + sum);
    }

    public long getSum() {
        return sum;
    }

    public static int getArrayLength() {
        return numbers.length;
    }

    public static void main(String[] args) {

        long t1 = System.currentTimeMillis();
        int cores = Runtime.getRuntime().availableProcessors();
        int totalLength = getArrayLength();
        int chunkSize = totalLength / cores;
        Array[] workers = new Array[cores];
        long totalSum = 0;
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 1000);
        }

        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;

            if (i == cores - 1) {
                end = totalLength;
            }
            workers[i] = new Array(start, end);
            workers[i].start();

        }
        for (Array hello : workers) {
            try {
                hello.join();
                totalSum += hello.getSum();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Main thread interrupted while waiting.");
            }

        }
        System.out.println("Total sum: " + totalSum);
        long t2 = System.currentTimeMillis();
        System.out.println("Total time taken is " + (t2 - t1) + " milliseconds");
    }
}

