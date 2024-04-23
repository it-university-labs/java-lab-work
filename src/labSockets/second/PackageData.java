package labSockets.second;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    String operationType;
    ArrayList<Book> books;
    Book book;

    public PackageData(String operationType, ArrayList<Book> books, Book book) {
        this.operationType = operationType;
        this.books = books;
        this.book = book;
    }

    public String getOperationType() {
        return operationType;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book getBook() {
        return book;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
