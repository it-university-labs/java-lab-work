package lab3;

import java.util.Scanner;

public class Player {
    String name;

    int id;
    String position;
    int number;
    boolean isInjured;

    Player(){

    }

    Player(String name, String position, int number, boolean isInjure, int id) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.isInjured = isInjured;
        this.id = id;
    }

    String getPlayerData() {
        return "Name: " + id + " " + name + " " + position + " " + number + " " + isInjured;
    }
}

class Club {
    String name;
    Player[] players;

    Club() {

    }

    Club(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    void printClubData() {
        System.out.println(name);
        System.out.println("Players: ");
        for(Player player : players) {
            System.out.println(player.getPlayerData());
        }
    }

    void printSquad() {
        System.out.println("Squad: ");
        for(Player player : players) {
            if(!player.isInjured) {
                System.out.println(player.id + " " + player.number + " " + player.name + " " + " " + player.position + " " + " " + player.isInjured);
            }
        }
    }

    void idFind() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        for(Player player : players) {
            if(id == player.id) {
                System.out.println(player.number + " " + player.name + " " + " " + player.position + " " + " " + player.isInjured);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Zharas", "CB", 1, false, 1),
                new Player("Max", "CDF", 2, false, 2),
                new Player("Timur", "FWD", 3, false, 3),
                new Player("Aziz", "GK", 4, false, 4),
                new Player("Dulat", "RB", 5, false, 5)
        };

        Club club = new Club("Example Club", players);

        club.printClubData();
        club.printSquad();
        club.idFind();
    }
}
