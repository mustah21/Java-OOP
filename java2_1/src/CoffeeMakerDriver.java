// Create another class, CoffeeMakerDriver,
// that creates an instance of CoffeeMaker and tests it by switching the device on,
// setting the coffee type and amount, and switching the device off.
// The output should be similar to the following:

import java.util.Scanner;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CoffeeMaker myCoffee = new CoffeeMaker();
        myCoffee.pressOnOff();

        System.out.println("What type of coffee would you like?  ");
        String coffeeType = scan.nextLine();
        myCoffee.setCoffeeType(coffeeType);

        System.out.println("What amount of coffee would you like?  ");
        int coffeeAmount = scan.nextInt();
        myCoffee.setCoffeeAmount(coffeeAmount);

        System.out.println
                ("Coffee maker is " + myCoffee.isOn() + ". Your coffee type is "
                        + myCoffee.getCoffeeType() + " and your coffee amount is " + myCoffee.getCoffeeAmount());
        myCoffee.pressOnOff();
        System.out.println("Coffee maker is " +  myCoffee.isOn());

        /* System.out.println
                ("Coffee maker is " + myCoffee.isOn() + ". Your coffee type is "
                        + myCoffee.getCoffeeType() + " and your coffee amount is " + myCoffee.getCoffeeAmount()); */
        // Added this as a check if it retains the amount and type after turning off






//        myCoffee.setCoffeeType("normal"); //
//        myCoffee.setCoffeeAmount(80);    //
//       System.out.println(myCoffee.getCoffeeType());
//       System.out.println(myCoffee.getCoffeeAmount());

    }
}
