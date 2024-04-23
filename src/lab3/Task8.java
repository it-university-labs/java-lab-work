package lab3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of actors/actresses");
        int n = scanner.nextInt();
        scanner.nextLine();

        Oscar[] nominees = new Oscar[n];

        for(int i = 0;i<n;i++) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            System.out.println("Surame: ");
            String surname = scanner.nextLine();

            System.out.print("Number of movies: ");
            int movies = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Average: ");
            double rating = scanner.nextDouble();
            scanner.nextLine();

            nominees[i] = new Oscar(name, surname, movies, rating);
        }

        Oscar.actorNominees(nominees);

        Oscar.showNominees(nominees);

        scanner.close();
    }
}
