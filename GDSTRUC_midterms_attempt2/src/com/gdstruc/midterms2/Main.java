package com.gdstruc.midterms2;

import java.util.Stack;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Stack<String> CardDeck = new Stack<>();
        Stack<String> PlayerHand = new Stack<>();
        Stack<String> PlayerPile = new Stack<>();

        int DeckSize = 3;

        for (int a = 0; a < DeckSize; a++) {
            CardDeck.push("Dracula");
            CardDeck.push("Alucard");
            CardDeck.push("Trevor Belmont");
            CardDeck.push("SyphaBelnades");
            CardDeck.push("Hector");
            CardDeck.push("Isaac");
            CardDeck.push("Carmilla");
            CardDeck.push("Lisa Tepes");
            CardDeck.push("Death");
            CardDeck.push("Godbrand");
        }

        while (CardDeck.size() > 0) {
            GameTurn(CardDeck, PlayerHand, PlayerPile, numberofCards());
            System.out.println("Run again? Press 1 for yes.");
            Scanner UserInput = new Scanner(System.in);

            int input = UserInput.nextInt();
            if (UserInput.equals("1")) {
                GameTurn(PlayerHand, PlayerPile, CardDeck, numberofCards());
            }
            if (CardDeck.isEmpty()) {
                System.out.println("No more cards to draw.");
                break;
            }
        }
    }

    public static void GachaInfo(Stack<String> CardDeck, Stack<String> PlayerHand, Stack<String> PlayerPile) {
        System.out.println("Number of Cards left: " + CardDeck.size());
        System.out.print("\nCards left:" + CardDeck);
        System.out.println("\n \n Number of Cards in Player Hand: " + PlayerHand.size());
        System.out.print("\nCards in Player Hand:" + PlayerHand);
        System.out.println("\n \n Number of discarded Cards: " + PlayerPile.size());
        System.out.print("\nDiscarded cards:" + PlayerPile);
    }

    public static void GameTurn(Stack CardDeck, Stack PlayerHand, Stack PlayerPile, int numberofCards) {
        Random rand = new Random();
        int gacha = rand.nextInt(3);

        if (gacha == 0) {
            drawCard(CardDeck, PlayerHand, PlayerPile, numberofCards);
        } else if (gacha == 1) {
            disCard(CardDeck, PlayerHand, PlayerPile, numberofCards);
        } else if (gacha == 2) {
            retrieveCard(CardDeck, PlayerHand, PlayerPile, numberofCards);
        }
    }

    private static int numberofCards() {
        Random rand2 = new Random();
        int x = rand2.nextInt(5-1) + 1;
        return x;
    }

    private static void drawCard(Stack CardDeck, Stack PlayerHand, Stack PlayerPile, int numberofCards) {

        if (CardDeck.isEmpty() || numberofCards > CardDeck.size()) {
            System.out.println("Number of cards to be drawn is greater than Card Deck. Adjusting...");
            numberofCards = CardDeck.size();
            System.out.println("Drawing " + numberofCards + " instead.");
        }

        for (int x = 0; x < numberofCards; x++) {
            PlayerHand.push(CardDeck.pop());
        }

        System.out.println("You have drawn " + numberofCards + " cards.");
        GachaInfo(CardDeck, PlayerHand, PlayerPile);
    }

    private static void disCard(Stack CardDeck, Stack PlayerHand, Stack PlayerPile, int numberofCards) {

        if (PlayerHand.isEmpty() || numberofCards > PlayerHand.size()) {
            System.out.println("Number of cards to be discarded is greater than Player Hand. Adjusting...");
            numberofCards = PlayerHand.size();
        }
        for (int x = 0; x < numberofCards; x++) {
            PlayerPile.push(PlayerHand.pop());
        }
        System.out.println("You have discarded " + numberofCards + " cards.");
        GachaInfo(CardDeck, PlayerHand, PlayerPile);
    }

    private static void retrieveCard(Stack CardDeck, Stack PlayerHand, Stack PlayerPile, int numberofCards) {

        if (PlayerPile.isEmpty() || numberofCards > PlayerPile.size()) {
            System.out.println("Number of cards to be retrieved is greater than Player Pile. Adjusting...");
            numberofCards = PlayerPile.size();
            System.out.println("Retrieving " + numberofCards + " instead.");
        }
        for (int x = 0; x < numberofCards; x++) {
            PlayerHand.push(PlayerPile.pop());
        }
        System.out.println("You have retrieved " + numberofCards + " cards.");
        GachaInfo(CardDeck, PlayerHand, PlayerPile);
    }
}