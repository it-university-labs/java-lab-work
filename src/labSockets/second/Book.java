package labSockets.second;

import java.io.Serializable;

public class Book implements Serializable {
    int id;
    String name;
    String author;

    Book(){

    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book name: " + name + " | " + "Author of the book" + author;
    }
}
