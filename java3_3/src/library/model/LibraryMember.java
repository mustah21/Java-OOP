package library.model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    void setName() {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    int getMemberId() {
        return this.memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    public void removeBook(Book book) {
        borrowedBooks.remove(book);
    }

    void printBorrowedBooks() {
        int i = 1;
        for (Book books : borrowedBooks) {
            System.out.println(i + ": " + books);
            i++;
        }
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
