package task2;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println(car.getInfo());


        Motorcycle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());


        Bus bus = new Bus();
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());


    }
}
