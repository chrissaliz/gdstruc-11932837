package com.gdstruc.midterms2;

import java.util.Stack;

public class Main {


    public static void main(String[] args) {

        Stack<String> CardDeck = new Stack<String>();

        CardDeck.push("Dracula");
        CardDeck.push("Alucard");
        CardDeck.push("Trevor Belmont");
        CardDeck.push("Sypha Belnades");
        CardDeck.push("Hector");
        CardDeck.push("Isaac");
        CardDeck.push("Carmilla");
        CardDeck.push("Lisa Tepes");
        CardDeck.push("Death");
        CardDeck.push("Godbrand");

        Stack<String> PlayerHand = new Stack<String>();

        Stack<String> PlayerPile = new Stack<String>();

        System.out.print(CardDeck);

        /*CardDeck.pop();
        System.out.print("PoppedDeck:");
        System.out.print(CardDeck);*/


        System.out.println("\n Draw Cards:");
        CardStack.drawCard();
        System.out.println(CardDeck);





    }



}
