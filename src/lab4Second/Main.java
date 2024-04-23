package lab4Second;

import lab3.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("National library","Almaty","Kazakhstan");

        /*for(int i = 1; i < 5; i++) {
            LitertureBook litertureBook = new LitertureBook("Literature" + i, "CODE" + i, 300 + i * 20, "Max" + i, 1967 + i * 2);
            ScientificBook scientificBook = new ScientificBook("Science" + i, "CODE" + i, 400 + i * 10, 500 + i * 5, "Max" + i);
            LitertureBook litertureBook2 = new LitertureBook("Literature2" + i, "CODE2" + i, 350 + i * 20, "Max2" + i, 1969 + i * 2);
            ScientificBook scientificBook2 = new ScientificBook("Science2" + i, "CODE2" + i, 450 + i * 10, 400 + i * 5, "Max2" + i);

            library.addBook(scientificBook);
            library.addBook(litertureBook);
            library.addBook(scientificBook2);
            library.addBook(litertureBook2);
        }
        library.printLibraryData();*/

        LitertureBook[] litertureBooks = {
                new LitertureBook("Literature", "CODE" , 300, "Max", 1967),
                new LitertureBook("Literature2", "CODE2", 350, "Max2", 1969)
        };

        ScientificBook[] scientificBooks = {
                new ScientificBook ("Science", "CODE", 400, 500, "Max"),
                new ScientificBook ("Science2", "CODE2", 450, 400, "Max2")
        };

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("PRESS [1] TO SEARCH NAME OF THE BOOK");
            System.out.println("PRESS [2] TO SEARCH BOOK BY THE CODE");
            System.out.println("PRESS [3] TO SEARCH BOOK BY PAGE AMOUNT");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    System.out.println("Enter the name of the book: ");
                    String bookName = scanner.next();
                    for(LitertureBook litertureBook : litertureBooks) {
                        if (litertureBook.name.equals(bookName)) {
                            System.out.println(litertureBook.name + " " + litertureBook.code + " " + litertureBook.pages);
                        }
                    }
                    for(ScientificBook scientificBook : scientificBooks) {
                        if (scientificBook.name.equals(bookName)) {
                            System.out.println(scientificBook.name + " " + scientificBook.code + " " + scientificBook.pages);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter the code of the book: ");
                    String bookCode = scanner.next();
                    for(LitertureBook litertureBook : litertureBooks) {
                        if (litertureBook.code.equals(bookCode)) {
                            System.out.println(litertureBook.name + " " + litertureBook.code + " " + litertureBook.pages);
                        }
                    }
                    for(ScientificBook scientificBook : scientificBooks) {
                        if (scientificBook.code.equals(bookCode)) {
                            System.out.println(scientificBook.name + " " + scientificBook.code + " " + scientificBook.pages);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the pages of the book: ");
                    int bookPages = scanner.nextInt();
                    for(LitertureBook litertureBook : litertureBooks) {
                        if (litertureBook.pages == bookPages) {
                            System.out.println(litertureBook.name + " " + litertureBook.code + " " + litertureBook.pages);
                        }
                    }
                    for(ScientificBook scientificBook : scientificBooks) {
                        if (scientificBook.pages == bookPages) {
                            System.out.println(scientificBook.name + " " + scientificBook.code + " " + scientificBook.pages);
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
