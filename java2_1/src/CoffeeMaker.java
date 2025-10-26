//A coffee maker has a selector for coffee type (normal/espresso)
// and a selector for coffee amount (10–80 ml).
// It also has an on/off switch that behaves in the same way as TV on/off switch.
// Coffee type and amount selectors behave like TV channel switch, i.e.,
// they can only be changed when the device is on,
// and the device remembers the selections even when it is switched off.

public class CoffeeMaker {

    private String coffeeType;
    private int coffeeAmount;
    private boolean on;

    public void setCoffeeType(String coffeeType) {
        if (on && (coffeeType.equals("normal") || coffeeType.equals("espresso"))) {
            this.coffeeType = coffeeType;
        }
    }

    String getCoffeeType() {
        return coffeeType;
    }


    public void setCoffeeAmount(int coffeeAmount) {
        if (on && (coffeeAmount >= 10 && coffeeAmount <= 80)) {
            this.coffeeAmount = coffeeAmount;
        }
    }

    int getCoffeeAmount() {
        return coffeeAmount;
    }


    public void pressOnOff() {
        on = !on;
    }

    public String isOn() {
        if (on) {
            return "On";
        } else {
            return "Off";
        }
    }
}