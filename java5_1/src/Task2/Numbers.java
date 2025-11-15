package Task2;

import java.util.Random;

public class Numbers extends Thread {

    private static final int[] NUM = new int[10000000];
    private long sum = 0;
    private final int startIndex;
    private final int endIndex;

    public Numbers(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        Random rand = new Random();
        for (int i = startIndex; i < endIndex; i++) {
            NUM[i] = (rand.nextInt(1000));
            sum += NUM[i];
        }
    }
    public long getSum() {
        return sum;
    }

    public static int getArrayLength() {
        return NUM.length;
    }
}