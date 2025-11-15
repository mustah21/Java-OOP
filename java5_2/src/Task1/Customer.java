package Task1;

public class Customer implements Runnable {

    Tickets tickets;
    private int seats;
    private  int customerId;
    private static int id = 1;


    public Customer(Tickets tickets, int seats) {
        this.tickets = tickets;
        this.seats = seats;
        customerId = id++;
    }

    public void run() {
        boolean success = tickets.reserveTickets(seats);
        if (success) {
            System.out.println("Customer " + customerId + " reserved tickets " + seats);
        } else {
            System.out.println("Customer " + customerId + " failed to reserve tickets " + seats);
        }

    }
    public static void main(String[] args) {
        Tickets shared = new Tickets(25);

        Customer c1 = new Customer(shared, 5 );
        Customer c2 = new Customer(shared, 7);
        Customer c3 = new Customer(shared, 6);
        Customer c4 = new Customer(shared, 8);
        Customer c5 = new Customer(shared, 9);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        Thread t5 = new Thread(c5);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        try {
            t1.join(); t2.join();  t3.join(); t4.join(); t5.join();
        } catch (InterruptedException ignored) {
        }
        System.out.println("COMPLETED!");
    }
}