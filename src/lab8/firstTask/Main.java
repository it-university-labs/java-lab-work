package lab8.firstTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.Scanner;

public class Main {
    private static final String FILENAME = "memory.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<User> users = getUsersList();

        int count = 0;
        while(true) {
            System.out.println("PRESS [1] TO ADD USERS");
            System.out.println("PRESS [2] TO LIST USERS");
            System.out.println("PRESS [3] TO DELETE USER");

            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    addUser(users);
                    break;
                case 2:
                    listUsers(users);
                    break;
                case 3:
                    deleteUsers(users);
                    break;
                default:
                    System.out.println("Try again if you want to live");
            }
        }

    }


    private static int getUserChoice() {
        return 2;
    }

    private static void addUser(ArrayList<User> users) {
        UUID uniqueID = UUID.randomUUID();

        User newUser = new User();
        newUser.setId(uniqueID);
        newUser.setLogin("newlogin");
        newUser.setPassword("123321");
        users.add(newUser);
        saveUsersList(users);
    }

    private static void listUsers(ArrayList<User> users) {
        for(User user : users) {
            System.out.println(user);
        }
    }

    private static void deleteUsers(ArrayList<User> users) {
        if (!users.isEmpty()) {
            users.remove(0);
            saveUsersList(users);
        } else {
            System.out.println("You know it's empty, right?");
        }
    }

    public static ArrayList<User> getUsersList() {
        ArrayList<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                User user = new User();
                user.setId(UUID.fromString(data[0]));
                user.setLogin(data[1]);
                user.setPassword(data[2]);
                users.add(user);
            }
        } catch (IOException e) {
            System.err.println("Error reading users from file: " + e.getMessage());
        }
        return users;
    }

    public static void saveUsersList(ArrayList<User> users) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            for (User user : users) {
                bw.write(user.getId() + "," + user.getLogin() + "," + user.getPassword());
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing users to file: " + e.getMessage());
        }
    }
}
