package task2;

public interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    @Override
    public void start() {
        System.out.println(type + " starting");
    }

    @Override
    public void stop() {
        System.out.println(type + " stopping");
    }

    @Override
    public abstract String getInfo();
}

class Car extends AbstractVehicle {
    private String color;

    public Car() {
        super("Car", "Diesel");
        this.color = "Black";

    }

    @Override
    public String getInfo() {
        return "Car information: " + "\ntype: " + type + "\nfuel: " + fuel + "\ncolor: " + color + "\n";
    }
}

class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle() {
        super("Motorcycle", "Petrol");
        this.color = "White";
    }

    @Override
    public String getInfo() {
        return "Motorcycle information: " + "\ntype: " + type + "\nfuel: " + fuel + "\ncolor: " + color + "\n";
    }
}

class Bus extends AbstractVehicle {
    private int capacity;

    public Bus() {
        super("Bus", "Diesel");
        this.capacity = 40;
        }

    @Override
    public String getInfo() {
        return "Bus information: " + "\ntype: " + type + "\nfuel: " + fuel + "\nCapacity: " + capacity + " passengers\n";

    }
}