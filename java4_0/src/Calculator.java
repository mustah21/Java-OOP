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