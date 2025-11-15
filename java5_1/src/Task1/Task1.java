package Task1;// Write a Java program that uses two threads to print numbers alternately.
// One thread should print odd numbers, and the other thread should print even numbers.
// The program should allow specifying a range of numbers to be printed. The output should be something like this:

import java.lang.Thread;

public class Task1 extends Thread {
//    private String type;
//    private int time;
//    private int num;
//    private int odd = 1;
//    private int even;
//
//    public Task1(int num) {
//        this.num = num;
//    }
//
//    @Override
//    public void run() {
//        try {
//            while (even != 22 && odd != 19) {
//                odd += 2;
//                System.out.println("odd Thread " + odd);
//                Thread.sleep(800);
//                even += 2;
//                System.out.println("even Thread " + even);
//                Thread.sleep(100);
//            }
//        } catch (InterruptedException e) {
//            System.out.println("Thread interrupted");
//            return;
//        }
//    }

    public static void main(String[] args) {
        Runnable writer = new Even();
        Runnable writer2 = new Odd();
        Thread t = new Thread(writer);
        Thread t2 = new Thread(writer2);

        t.start();
        t2.start();

        try {
            t.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Main thread interrupted while waiting.");
        }
        System.out.println("\nPrinting completed.");
    }
}