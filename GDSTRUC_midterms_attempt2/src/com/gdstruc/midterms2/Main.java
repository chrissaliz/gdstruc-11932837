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


        System.out.println("Number of Cards left: " + CardDeck.size());
        System.out.print(CardDeck);
        System.out.println("Number of Cards in Player Hand: " + PlayerHand.size());
        System.out.print(PlayerHand);
        System.out.println("Number of discarded Cards: " + PlayerPile.size());
        System.out.print(PlayerPile);


        Random rand = new Random();
        int gacha = rand.nextInt(3 + 1);


        /*public static void runGacha( idk what to put here but i need it to read the CardDeck, PlayerHand, and PlayerPile...??
        if that's possible.......) {*/
        while (CardDeck.size() > 0) {
            Random rand2 = new Random();
            int numberofCards = rand2.nextInt(5);

            if (gacha == 1) { //draw card from carddeck into playerhand

                if(CardDeck.isEmpty() || numberofCards > CardDeck.size()) {
                    System.out.println("Cannot draw card.");
                    return;
                }

                for (int x = 0; x < numberofCards; x++) {
                    PlayerHand.push(CardDeck.pop());
                }

                System.out.println("You have drawn " + numberofCards + " cards.");
                System.out.println("Number of Cards left: " + CardDeck.size());
                System.out.print(CardDeck);
                System.out.println("Number of Cards in Player Hand: " + PlayerHand.size());
                System.out.print(PlayerHand);
                System.out.println("Number of discarded Cards: " + PlayerPile.size());
                System.out.print(PlayerPile);

            } else if (gacha == 2) { //discard card from playerhand

                if (PlayerHand.isEmpty()) {
                    System.out.println("Player's Hand is empty.");
                    return;
                }
                for (int x = 0; x < numberofCards; x++) {
                    PlayerPile.push(PlayerHand.pop());
                }
                System.out.println("You have discarded " + numberofCards + " cards.");
                System.out.println("Number of Cards left: " + CardDeck.size());
                System.out.print(CardDeck);
                System.out.println("Number of Cards in Player Hand: " + PlayerHand.size());
                System.out.print(PlayerHand);
                System.out.println("Number of discarded Cards: " + PlayerPile.size());
                System.out.print(PlayerPile);
            } else if (gacha == 3) {

                if (PlayerPile.isEmpty()) { //retrieve card from pile
                    System.out.println("Discarded pile is empty.");
                    return;
                }
                for (int x = 0; x < numberofCards; x++) {
                    PlayerHand.push(PlayerPile.pop());
                }
                System.out.println("You have retrieved " + numberofCards + " cards.");
                System.out.println("Number of Cards left: " + CardDeck.size());
                System.out.print(CardDeck);
                System.out.println("Number of Cards in Player Hand: " + PlayerHand.size());
                System.out.print(PlayerHand);
                System.out.println("Number of discarded Cards: " + PlayerPile.size());
                System.out.print(PlayerPile);
            }
        }

            if (CardDeck.size() == 0) {
                System.out.println("No more cards to draw.");
            }


        System.out.println("Run again? Press 1 for yes, 0 for no.");
        Scanner UserInput = new Scanner(System.in);

        int input = UserInput.nextInt();
        if (UserInput.equals("1")) {
            return;
        } else if (UserInput.equals("0")) {
            System.out.println("System ended.");
        }

        }

    }
