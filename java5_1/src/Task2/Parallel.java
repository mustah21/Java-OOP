package Task2;

public class Parallel extends Thread {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        int totalLength = Numbers.getArrayLength();
        long startTime = System.currentTimeMillis(); // just to see how long it takes

        System.out.println("Available Cores: " + cores);

        int chunkSize = totalLength / cores;
        System.out.println("Chunk Size: " + chunkSize); // each thread get this amount of computations

        Numbers[] workers = new Numbers[cores];
        int startIndex = 0;

        for (int i = 0; i < cores; i++) {
            int endIndex = startIndex + chunkSize;

            if (i == cores - 1) {
                endIndex = totalLength;
            }
            workers[i] = new Numbers(startIndex, endIndex);
            workers[i].start();
            startIndex = endIndex;
        }

        long totalSum = 0;
        System.out.println("All " + cores + " worker threads have been started concurrently.");
        for (Numbers worker : workers) {
            try {
                worker.join();
                totalSum += worker.getSum();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Main thread interrupted while waiting.");
            }

        }
        System.out.println("Calculated Total Sum: " + totalSum);
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time: " + (endTime - startTime) + " ms");
    }
}
