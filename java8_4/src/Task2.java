
import java.util.ArrayList;


public class Task2 {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println("List before computations: " + list);


        int filterEven = list.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n * 2)
                .sum();

        System.out.println("\nSum of resulted numbers: " + filterEven);


    }

}



