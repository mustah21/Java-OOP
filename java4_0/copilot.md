```

public class Calculator {

    private int total;

    public Calculator() {
        this.total = 0;
    }
    void reset() {
        this.total = 0;
    }

    void sum(int number) {
        if  (number > 0) {
            this.total += number;
        } else {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
    }

    public int getTotal() {
        return this.total;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.reset();
        calculator.sum(1);
        calculator.sum(2);
        calculator.sum(3);
        calculator.sum(4);
        calculator.sum(5);
        calculator.sum(6);
        calculator.sum(7);
        System.out.println(calculator.getTotal());
    }

}
```

🤖 GitHub Copilot-Style Explanation
This class represents a simple calculator that can sum positive integers. It maintains a running total and provides methods to reset the total, add a number to the total, and retrieve the current total. If a negative number is passed to the sum method, it throws an IllegalArgumentException. The main method demonstrates usage by summing the numbers 1 through 7 and printing the result.

✨ Improved, More Readable Explanation
This Calculator class is a basic model that performs addition of positive integers:

State: It keeps track of a single internal value called total, which starts at zero.

Constructor: Initializes the calculator with a total of zero.

reset() method: Resets the total back to zero.

sum(int number) method: Adds a positive integer to the total. If the input is negative, it throws an exception to prevent invalid operations.

getTotal() method: Returns the current total value.

main() method: Demonstrates how the calculator works by:

Creating a new instance

Resetting the total

Adding the numbers 1 through 7

Printing the final result, which is 28

This class is designed to be part of an MVC architecture, acting as the Model that encapsulates the business logic and state.