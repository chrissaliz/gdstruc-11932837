package com.gdstruc.module4;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayQueue Matchmaking = new ArrayQueue(7);
        Player newPlayers = new Player();
        int countofGames = 0;

        while (countofGames < 10) {
            GameTurn(Matchmaking, newPlayers);

            if (Matchmaking.size() >= 5) {
                for (int i = 0; i < 5; i++) {
                    Matchmaking.remove();
                }
                System.out.println("Game successfully made. " + Matchmaking.size() + " players left.");
                countofGames++;
            }
            Scanner pause = new Scanner(System.in);
            pause.nextLine();
        }
        if (countofGames == 10) {
            System.out.println("No more games can be made.");
        }
    }

    public static void GameTurn(ArrayQueue Matchmaking, Player newPlayers) {
        Matchmaking.add();
        Matchmaking.printQueue();
    }
}

