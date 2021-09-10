package com.gdstruc.midterms;

import java.util.Random;
import java.util.*;


public class CardStack {


    private LinkedList<Card> stack;
    int cardsDrawn = 0;

    public CardStack()
    {

        stack = new Stack<Card>();
    }

    public void push (Card card)
    {

        stack.push(card);
    }

    public boolean isEmpty()
    {

        return stack.isEmpty();
    }

    public Card pop()
    {

        return stack.pop();
    }

    public Card peek()
    {
        return stack.peek();
    }

    public int numberOfCards()
    {
        Random rand = new Random();
        int drawnCards = rand.nextInt(5);
        return drawnCards;

    }

    public void drawCard(Card card)
    {
        for (int x = 0; x < numberOfCards(); x++)
        {
            stack.push(stack.pop());
        }

        cardsDrawn = cardsDrawn + numberOfCards();
    }

    public void discardCard(Card card)
    {
        for (int y = 0; y < numberOfCards(); y++)
        {
            stack.pop();
        }

        cardsDrawn = cardsDrawn - numberOfCards();
    }


}
