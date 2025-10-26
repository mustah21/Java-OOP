import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many integers? ");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        if (size > 0) {
            for (int i = 0; i < size; i++) {
                System.out.println("Enter the number " + (i + 1) + ":");
                numbers[i] = scan.nextInt();
            }
            int[] newArray = new int[size];
            int unique = 0;
            for (int i = 0; i < size; i++) {
                boolean isDuplicate = false;
                for (int j = 0; j < unique; j++) {
//                  System.out.println("i" + ": " + i);

                    if (numbers[i] == newArray[j]){
//                        System.out.println("i: " + i  + " , " + "j: " + j);
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    newArray[unique] = numbers[i];
                    unique++;
                }

            }
            System.out.println("The array without any duplicates: ");
            for (int k = 0; k < unique; k++) {
                System.out.print(newArray[k] + " ");
            }
        }
    }
}
