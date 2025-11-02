package task1;

interface Vehicle {
    void start();
    void stop();

    String getInfo();
}

class Car implements Vehicle {
    private String type = "Car";
    private String fuel = "Petrol";
    private String color = "Red";

    @Override
    public void start() {
        System.out.println("Car starting");
    }
    @Override
    public void stop() {
        System.out.println("Car stopping");
    }

    @Override
    public String getInfo() {
        return "Car information: " + "\ntype: " + type + "\nfuel: " + fuel + "\ncolor: " + color + "\n";
    }
}

class Motorcycle implements Vehicle {
    private String type = "Motorcycle";
    private String fuel = "Petrol";
    private String color = "Black";

    @Override
    public void start() {
        System.out.println("Motorcycle starting");
    }
    @Override
    public void stop() {
        System.out.println("Motorcycle stopping");
    }

    @Override
    public String getInfo() {
        return "Motorcycle information: " + "\ntype: " + type + "\nfuel: " + fuel + "\ncolor: " + color + "\n";
    }
}

class Bus implements Vehicle {
    private String type = "Car";
    private String fuel = "Petrol";
    private int capacity = 40;

    @Override
    public void start() {
        System.out.println("Bus starting");
    }
    @Override
    public void stop() {
        System.out.println("Bus stopping");
    }

    @Override
    public String getInfo() {
        return "Bus information: " + "\ntype: " + type + "\nfuel: " + fuel + "\nCapacity: " + capacity + " passengers\n";

    }
}


