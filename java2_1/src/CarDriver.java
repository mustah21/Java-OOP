
public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();


        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

//        while (myCar.getSpeed() > 0) {
//            myCar.decelerate(5);
//            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
//        }


        myCar.setTargetSpeed(120);
        System.out.println("Target Speed: " + myCar.getTargetSpeed());
        myCar.turnCruiseControlOn();
        if (myCar.isCruiseControlOn()) {
            while (myCar.getSpeed() != myCar.getTargetSpeed()) {
                myCar.updateSpeed();
            }
        }
        System.out.println("New Speed after update: " + myCar.getSpeed() + " km/h");


    }
}