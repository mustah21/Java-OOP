package library.system.library.system;

import library.system.library.model.Book;
import library.system.library.model.LibraryMember;

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
        if (books.contains(book)){
            books.remove(book);
            libraryMember.addBook(book);
        } else {
            System.out.println("Book is not in the library");
        }
    }

    public void returnBook(LibraryMember libraryMember, Book book) {
        if (libraryMember.getBorrowedBooks().contains(book)){
            books.add(book);
            libraryMember.removeBook(book);
        }
    }
}
