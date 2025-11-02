import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

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

    // Made another ArrayList so it can keep track of the books being given out
    // It helps with the return book method, adds a check
    void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                borrowedBooks.add(book);
                books.remove(i);
                System.out.println("\nBook " + title + " has been successfully borrowed.");
                return;
            }
        }
        System.out.println("Book " + title + " does not exist in the collection.");
    }

    void returnBook(Book book) {
        if (!books.contains(book)) {
            if (borrowedBooks.contains(book)) {
                books.add(book);
                borrowedBooks.remove(book);
                System.out.println("Book " + book.getTitle() + " is added back to the collection.");
            } else {
                System.out.println("\nBook " + book.getTitle() + " not found in the borrowed in the collection.");
            }
        } else {
            System.out.println("This book never existed in this library collection");
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
        System.out.println(sum);
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

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Atomic Habits", "James Clear", 1990);
        Book book2 = new Book("Bloodline", "Sydney Sheldon", 1995);
        Book book3 = new Book("Nexus", "Yuval Noah", 2000);
        Book book4 = new Book("The Naked Face", "Sydney Sheldon", 2005);


        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.displayBooks();
        library.findBookByAuthor("Sydney Sheldon");
        library.borrowBook("Nexus");
        library.borrowBook("alchemist"); // checking
        System.out.println("\n ----------");
        library.displayBooks();
        System.out.println("\n ----------");

        library.returnBook(book3);
        library.displayBooks();
        System.out.println("Does this book exist in collection?  " + library.isBookAvailable("Nexus"));

        System.out.println("\n\n---------Testing review methods---------");
        book1.setRating(4.5);
        book2.setRating(3.5);
        book3.setRating(2.5);
        book4.setRating(1.5);

        book1.addReview("Amazing book, very practical!");
        book1.addReview("Loved the actionable tips!");
        book2.addReview("Thrilling story!");
        book3.addReview("Interesting concept.");
        book3.addReview("Could be better.");
        book3.addReview("Loved the writing style.");
        book4.addReview("Good read.");

        System.out.println("Average book rating: " + library.getAverageBookRating());
        Book mostReviewedBook = library.getMostReviewedBook();
        if (mostReviewedBook != null) {
            System.out.println(mostReviewedBook.getTitle() + " is the most reviewed book with"
                    + " " + mostReviewedBook.getReviewCount() + " reviews.");
        } else {
            System.out.println("No books in the library.");

        }

    }
}