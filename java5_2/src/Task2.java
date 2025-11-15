import Task1.Tickets;

import java.util.ArrayList;

public class Task2 {

    private ArrayList<String> test = new ArrayList<>();

    synchronized void add(String add) {
        test.add(add);
    }

    synchronized void remove(String remove) {
        test.remove(remove);
    }

    synchronized int getSize() {
        return test.size();
    }

    public synchronized ArrayList<String> getList() {
        return test;
    }

    public static void main(String[] args) {
        Task2 task = new Task2();

        class adding implements Runnable {
            public void run() {
                task.add("add");
                task.add("add1");
                task.add("add2");
                task.add("add3");
            }
        }
        class removing implements Runnable {
            public void run() {
                task.remove("add3");
                task.remove("add2");
            }
        }
        class ListSize implements Runnable {
            public void run() {
                System.out.println("Size: " + task.getSize());
                System.out.println("Current List: " + task.getList());
            }
        }

        Thread t = new Thread(new adding());
        Thread t1 = new Thread(new removing());
        Thread t2 = new Thread(new ListSize());
        t.start();
        t1.start();
        t2.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        try  {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        // Just to prove sync works
        System.out.println("Final Size: " + task.getSize());
        System.out.println("Final List: " + task.getList());
    }

}


