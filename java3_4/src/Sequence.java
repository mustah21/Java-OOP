import java.io.FileWriter;
import java.io.IOException;

public class Sequence {

    void fibonacci() {
        try {
            FileWriter writer = new FileWriter("fibonacci.csv");
            writer.write("Index;Fibonacci\n");

            // you can think of variables a and b as temp variables that compliment each other.
            long a = 0, b = 1;
            for (int i = 0; i < 60; i++) {
                long sum = a + b;
                writer.write((i + 1) + ";" + sum + "\n");
                a = b;
                b = sum;
                System.out.println(i + ": Fibonacci: " + sum);
            }

            writer.close();
            System.out.println("Fibonacci sequence saved to fibonacci.csv");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Sequence obj = new Sequence();
        obj.fibonacci();
    }
}