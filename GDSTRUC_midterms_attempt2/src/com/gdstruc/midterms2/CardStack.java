package com.gdstruc.midterms2;
import java.util.Random;
import java.util.Stack;

public class CardStack {

    private static Stack<Main> cardDeck;
    private static Stack<Main> PlayerHand;
    private static Stack<Main> PlayerPile;

    private static int cardsDrawn = 0;

    CardStack CardDeck = new CardStack();


    public static int numberOfCards()
    {
        Random rand = new Random();
        int drawnCards = rand.nextInt(5);
        return drawnCards;

    }

    public int randomFunction()
    {
        Random randFunction = new Random();
        int chosenFunction = randFunction.nextInt(3);
        return chosenFunction;
    }

     public static void drawCard()
    {
        int drawCard = 1;

        numberOfCards();
        System.out.println("\n Number of Cards drawn: " + numberOfCards());

        for (int x = 0; x < numberOfCards(); x++)
        {
            PlayerHand.push(cardDeck.pop());
            break;
        }

        cardsDrawn = cardsDrawn + numberOfCards();
    }

    public static void discardCard()
    {
        int discardCard = 2;

        for (int y = 0; y < numberOfCards(); y++)
        {
            PlayerPile.push(cardDeck.pop());
        }

        cardsDrawn = cardsDrawn - numberOfCards();
    }

    public static void getCard()
    {
        int getCard = 3;

        for (int z = 0; z < numberOfCards(); z++)
        {
            PlayerHand.push(PlayerPile.pop());
        }

        cardsDrawn = cardsDrawn + numberOfCards();
    }


}
