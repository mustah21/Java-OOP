import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstNames = {"Mustafa", "Dipak", "Aroush" , "Vivek", "Tanvir"};
        String[] lastNames = {"Ahmad", "Kumar", "Irfan", "Sharma", "Nibir"};

        System.out.println("How many names should the user generate? ");
        int names = scan.nextInt();
        Random rand = new Random();
        int j = 0;
        int z = 0;

        for  (int i = 0; i < names; i++) {
            j =  rand.nextInt(firstNames.length);
            z =  rand.nextInt(lastNames.length);
            String random_names = firstNames[j] + " " + lastNames[z];
            System.out.println("Your random names are: " + random_names);
        }
    }
}