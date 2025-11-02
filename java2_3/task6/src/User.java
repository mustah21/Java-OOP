import java.util.ArrayList;

public class User {

    private String name;
    private int age;
    private ArrayList<Book> myBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.myBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Book book) {
        myBooks.add(book);
    }

    public void remove(Book book) {
        myBooks.remove(book);
    }

    public void displayBorrowedBooks() {
        if (myBooks.isEmpty()) {
            System.out.println("No books borrowed by " + name);
        } else {
            for (Book borrow : myBooks) {
                System.out.println(" --" + borrow.getTitle() + "by" + borrow.getAuthor());
            }
        }
    }

    public ArrayList<Book> getBorrowedBooks() {
        return myBooks;
    }

}
