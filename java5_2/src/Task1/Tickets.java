package Task1;


public class Tickets {
    private int availableSeats;

    public Tickets(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized boolean reserveTickets(int seats) {
        if (availableSeats > seats) {
            availableSeats -= seats;
            return true;
        } else {
            return false;
        }
    }
}