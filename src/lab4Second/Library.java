package lab4Second;

import java.util.Scanner;

public class Library {
    private String name;
    private String city;
    private String country;
    private Book[] books = new Book[100];
    private int sizeOfBooks = 0;

    Library() {}
    Library(String name, String city, String country) {
        this.name = name;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addBook(Book b) {
        books[sizeOfBooks++] = b;
    }

    public void printLibraryData() {
        System.out.println(name + " " + city + " " + country);
        for (int i=0;i<sizeOfBooks;i++) {
            System.out.println(books[i].getBookData());
        }
    }
}

