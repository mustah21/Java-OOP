public class task4 {
    private String name;

    public task4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        task4 cat = new task4("Whiskers");
        task4 catTwo = new task4("Puffy");

        // Call the meow method on the cat instance
        cat.meow();
        catTwo.meow();
    }
}