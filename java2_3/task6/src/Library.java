import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("\n\n----Displaying Books-----");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + "," + " Author: " + book.getAuthor() + ", Publication Year: " + book.getPublicationYear());
        }
    }

    public void findBookByAuthor(String author) {
        boolean found = false;
        int i = 1;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("\n" + i + ": Book exists: " + "\n  --Title: " + book.getTitle() + ", Author: " + book.getAuthor());
                found = true;
                i++;
            }
        }
        if (!found) {
            System.out.println("\nBook" + author + " not found in collection. ");
        }
    }

    void borrowBook(String title, User users) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                borrowedBooks.add(book);
                users.add(book);
                books.remove(i);
                System.out.println("\nBook " + title + " has been successfully borrowed.");
                return;
            }
        }
        System.out.println("Book " + title + " does not exist in the collection.");
    }

    void returnBook(Book book, User user) {

        if (user.getBorrowedBooks().contains(book)) {
            if (borrowedBooks.contains(book)) {
                books.add(book);
                borrowedBooks.remove(book);
                user.remove(book);
                System.out.println("Book: " + book.getTitle() + " returned by " + user.getName() + " and added back to stock.");
            }
        } else if (books.contains(book)) {
            System.out.println(" Book " + book.getTitle() + " is already in the available collection.");

        } else {
            System.out.println(" Failed: Book " + book.getTitle() + " not tracked as borrowed or available. Possible unknown book.");
        }
    }

    boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    double getAverageBookRating() {
        double sum = 0;
        double averageRating = 0.0;
        int count = 0;
        for (Book book : books) {
            sum += book.getRating();
            count++;
        }
        if (count < 0) {
            System.out.println("No ratings available");
        }
        averageRating = sum / count;
        return averageRating;
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        Book mostReviewed = books.get(0);
        int maxReviews = mostReviewed.getReviewCount();

        for (Book book : books) {
            if (book.getReviewCount() > maxReviews) {
                maxReviews = book.getReviewCount();
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }

    void registerUser(User user) {
        this.users.add(user);
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }


    public static void main(String[] args) {
        Library library = new Library();


        User mustafa = new User("Mustafa", 21);
        User alice = new User("Alice", 25);
        library.registerUser(mustafa);
        library.registerUser(alice);
        System.out.println("--- SETUP ---");
        System.out.println("Registered Users: " + library.getUsers().size());

        // 2. SETUP: Create Books, Add to Library
        Book book1 = new Book("Atomic Habits", "James Clear", 1990);
        Book book2 = new Book("Bloodline", "Sydney Sheldon", 1995);
        Book book3 = new Book("Nexus", "Yuval Noah", 2000);
        Book book4 = new Book("The Naked Face", "Sydney Sheldon", 2005);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.displayBooks();

        // TEST 1: Mustafa Borrows Nexus
        System.out.println("\n--- TEST 1: Successful Borrow ---");
        library.borrowBook("Nexus", mustafa);
        library.displayBooks();
        mustafa.displayBorrowedBooks();

        // Alice attempts to borrow Nexus (now unavailable)
        System.out.println("\n--- TEST 2: Borrow Unavailable Book ---");
        library.borrowBook("Nexus", alice);

        // Mustafa returns Nexus
        System.out.println("\n--- TEST 3: Successful Return ---");
        library.returnBook(book3, mustafa);
        library.displayBooks();
        mustafa.displayBorrowedBooks();

        // (didn't borrow it)
        System.out.println("\n--- TEST 4: Incorrect Returner ---");
        library.returnBook(book3, alice);

        // (should fail)
        System.out.println("\n--- TEST 5: Borrow Unknown Book ---");
        library.borrowBook("The Alchemist", mustafa);
    }
}
