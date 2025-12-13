public class task2 {
    public static void main(String[] args) {
        System.out.println("   * ");
        System.out.println("  *** ");
        System.out.println(" ***** ");
        System.out.println("******* ");

        // maybe use a variable

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
