import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + "," +
                    " Author: " + book.getAuthor() +
                    ", Publication Year: " + book.getPublicationYear());
        }
    }

    public void findBookByAuthor(String author) {
        boolean found = false;
        int i = 1;
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("\n" + i +": Book exists: "
                        + "\n  --Title: " + book.getTitle() +
                        ", Author: " + book.getAuthor());
                found = true;
                i++;
            }
        }
        if (!found) {
            System.out.println("\nBook" + author +  " not found in collection. ");
        }
    }

    public void findBookByTitle(String bookTitle) {
        boolean found = false;
        int i = 1;
        for (Book bookByName : books) {
            if (bookByName.getTitle().equals(bookTitle)) {
                System.out.println("\n" + i +": Book exists: " +
                        "\n  --Title: " + bookByName.getTitle() +
                        ", Author: " + bookByName.getAuthor());
                found = true;
                i++;
            }
        }
        if (!found) {
            System.out.println("\nBook " + bookTitle +  " not found in collection. ");
        }


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
        library.findBookByTitle("Nexus");

    }
}