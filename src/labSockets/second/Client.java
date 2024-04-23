package labSockets.second;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("localhost", 7777);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while (true) {
                System.out.println("PANEL");
                System.out.println("1. List books");
                System.out.println("2. Add books");
                System.out.println("0. Disconnect");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option == 1) {
                    PackageData request  = new PackageData("GET_BOOKS", null, null);
                    outputStream.writeObject(request);

                    PackageData response = (PackageData) inputStream.readObject();
                    ArrayList<Book> books = response.getBooks();

                    System.out.println("List of books: ");
                    for (Book book : books) {
                        System.out.println(book);
                    }
                } else if (option == 2) {
                    System.out.println("Enter the name of the book");
                    String bookName = scanner.nextLine();
                    System.out.println("Enter the author of the book");
                    String bookAuthor = scanner.nextLine();

                    ArrayList<Book> books = new ArrayList<>();
                    books.add(new Book(11, bookName, bookAuthor));
                    System.out.println("New book has been added");
                } else if (option == 0) {
                    break;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
            socket.close();
            scanner.close();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
