// Using your earlier Car class create Bus class that can take a number of passengers
// (passengerEnter() and passengerExit() or similar methods are needed probably).

public class Bus extends Car {
    private int passengers;

    public Bus(int passengers, double speed, double gasolineCapacity, String typeName) {
        super(speed, gasolineCapacity, typeName);
        this.passengers = 0;
    }

    void setPassengerEnter(int passengers) {
        this.passengers += passengers;
    }

    void setPassengerOneByOne() {
        this.passengers++;
    }

    void setPassengerExit(int exit) {
        this.passengers -= exit;
    }

    void setPassengerExitOneByOne() {
        if (passengers > 0) {
            this.passengers--;
        } else {
            System.out.println("No passengers are left");
        }
    }

    int getPassengers() {
        return passengers;
    }

    public static void main(String[] args) {
        Bus mybus = new Bus(40, 100, 200, "SchoolBus");
        mybus.fillTank();

        mybus.setPassengerEnter(40);
        System.out.println("Passengers: " + mybus.passengers);

        mybus.setPassengerExit(20);
        System.out.println("Passengers: " + mybus.passengers);

        System.out.println("\n----------\n");

        for (int i = 0; i < 10; i++) {
            mybus.setPassengerExitOneByOne();
            i++;
        }

        System.out.println("Passengers: " + mybus.passengers);
        for (int i = 0; i < 5; i++) {
            mybus.setPassengerExitOneByOne();
            i++;
        }
        System.out.println("Passengers: " + mybus.passengers);


    }
}
