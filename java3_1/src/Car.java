// task2 and 4
public class Car {

    protected double speed;
    private int targetSpeed;
    protected double gasolineLevel;
    protected double gasolineCapacity;
    private String typeName;
    private boolean cruiseControl;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
    }

    public Car(double speed, double gasolineCapacity, String typeName) {
        this.speed = speed;
        this.gasolineCapacity = gasolineCapacity;
        this.typeName = typeName;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    public void setTargetSpeed(int targetSpeed) {
        if (targetSpeed >= 50 && targetSpeed <= 150) {
            this.targetSpeed = targetSpeed;
        }
    }

    int getTargetSpeed() {
        return targetSpeed;
    }

    boolean isCruiseControlOn() {
        return cruiseControl;
    }

    void turnCruiseControlOff() {
        cruiseControl = false;
    }

    void turnCruiseControlOn() {
        cruiseControl = gasolineLevel > 0 && targetSpeed >= 50 && targetSpeed <= 150;
    }

    void updateSpeed() {
        if (cruiseControl) {
            if (speed < targetSpeed) {
                accelerate();
            } else if (speed > targetSpeed) {
                decelerate(10);
            }
        }
        if (gasolineLevel <= 0) {
            cruiseControl = false;
        }
    }

}