package labSockets.second;
import java.io.*;
import java.net.*;
import java.net.ServerSocket;
import java.util.ArrayList;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            System.out.println("Server started. Waiting for client... ");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler extends Thread {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());

            ArrayList<Book> books = new ArrayList<>();
            books.add(new Book(1, "Book1", "Max"));
            books.add(new Book(2, "Book2", "Fax"));
            books.add(new Book(3, "Book3", "Pax"));
            books.add(new Book(4, "Book4", "Rax"));

            while (true) {

                PackageData request = (PackageData) inputStream.readObject();

                if (request.getOperationType().equals("GET_BOOKS")) {
                    PackageData response = new PackageData("BOOK_LIST", books, null);
                    outputStream.writeObject(response);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
