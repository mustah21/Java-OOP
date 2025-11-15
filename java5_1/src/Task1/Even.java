package Task1;

public class Even implements Runnable {
    private int even;

    @Override
    public void run() {
        try {
            do {
                even += 2;
                System.out.println("Even Thread " + even);
                Thread.sleep(100);
            } while (even != 20);

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            return;
        }
    }
}
