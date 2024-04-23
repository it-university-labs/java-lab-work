package labSockets.first;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your username: ");
            String username = scanner.nextLine();

            Socket socket = new Socket("localhost", 5555);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            while(true) {
                System.out.println("Panel");
                System.out.println("1. Send Message");
                System.out.println("2. Exit");
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option == 1) {
                    System.out.println("Insert message text: ");
                    String messageText = scanner.nextLine();

                    MessageData message = new MessageData(username, messageText);
                    outputStream.writeObject(message);
                } else if (option == 2) {
                    break;
                } else {
                    System.out.println("Invalid option. Try again please.");
                }
            }

            socket.close();
            scanner.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
