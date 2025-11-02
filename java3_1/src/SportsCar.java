// Using your earlier Car class create SportsCar class that has
// better acceleration and deceleration (and higher gasoline consumption) than an ordinary Car.


public class SportsCar extends Car {

    public SportsCar(double speed, double gasolineCapacity, String typeName) {
        super(speed, gasolineCapacity, typeName);
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0)
            speed += 30;
        else {
            speed = 0;
        }
    }

    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - (amount*3));
           double newGas = getGasolineLevel() - 5.0;
           setGasolineLevel(newGas);
        } else {
            speed = 0;
        }
    }

    void setGasolineLevel(double newLevel) {
        gasolineLevel = Math.max(0, newLevel);
    }

    public static void main(String[] args) {
        SportsCar porsche;

        porsche = new SportsCar(0, 100, "Carrera");
        porsche.fillTank();

        for (int i = 0; i < 6; i++) {
            porsche.accelerate();
            System.out.println(porsche.getTypeName() + ": speed is " + porsche.getSpeed() + " km/h");
        }
        System.out.println("\n\n -----------------  \n\n");

        for (int i = 0; i < 6; i++) {
            porsche.decelerate(5);
            System.out.println(porsche.getTypeName() + ": speed is " +
                    porsche.getSpeed() + " km/h" + "and gasoline level is: " + porsche.getGasolineLevel());
        }
    }
}