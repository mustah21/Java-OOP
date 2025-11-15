package Task1;

public class Odd implements Runnable {
    private int odd = -1;

    @Override
    public void run() {
        try {
            do {
                odd += 2;
                System.out.println("Odd Thread " + odd);
                Thread.sleep(800);
            } while (odd != 19);

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            return;
        }
    }
}
