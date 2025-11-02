package libraryReserve.system;

import libraryReserve.model.Book;
import libraryReserve.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<LibraryMember> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void borrowBook(LibraryMember libraryMember, Book book) {
        if (books.contains(book)) {
            books.remove(book);
            libraryMember.addBook(book);
        } else {
            System.out.println("Book is not in the library");
        }
    }

    public void returnBook(LibraryMember libraryMember, Book book) {
        if (libraryMember.getBorrowedBooks().contains(book)) {
            books.add(book);
            libraryMember.removeBook(book);
        }
    }

    public void reserveBook(LibraryMember libraryMember, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            libraryMember.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember libraryMember, Book book) {
        if (book.isReserved()) {
            book.setReserved(false);
            libraryMember.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }
    public void displayReservedBooks(LibraryMember libraryMember) {
        System.out.println("Reserved books for " + libraryMember.getName() + ":");
        int i = 1;
        for (Book book : libraryMember.getReservedBooks()) {
            System.out.println(i + ": " + book.getTitle());
            i++;
        }
    }
    public ArrayList<Book> getAvailableBooks() {
        return books;
    }
}
