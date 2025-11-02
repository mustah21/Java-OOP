package task1;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        System.out.println(car.getInfo());


        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());


        Vehicle bus = new Bus();
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());


    }
}
