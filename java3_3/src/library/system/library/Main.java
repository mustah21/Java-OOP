package library.system.library;

import library.system.library.model.Book;
import library.system.library.model.LibraryMember;
import library.system.library.system.Library;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", "12345");
        Book book2 = new Book("Book 2", "Author 2", "67891");
        Book book3 = new Book("Book 3", "Author 3", "12457");
        Book book4 = new Book("Book 4", "Author 4", "12355");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        LibraryMember member1= new LibraryMember("Mustafa", 1);
        LibraryMember member2= new LibraryMember("Ahmad", 2);
        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(member1, book3);
        library.borrowBook(member2, book4);
        library.borrowBook(member2, book1);
        library.returnBook(member2, book1);

        System.out.println(member1.getName()+" has borrowed:"+ member1.getBorrowedBooks());
        System.out.println(member2.getName()+" has borrowed:"+ member2.getBorrowedBooks());


    }
}