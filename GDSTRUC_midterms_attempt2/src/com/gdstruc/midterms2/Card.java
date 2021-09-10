package com.gdstruc.midterms2;

public class Card {

    private String CardName;


    public Card(String cardName) {
        CardName = cardName;
    }


    public String getCardName() {
        return CardName;
    }

    public void setCardName(String cardName) {
        CardName = cardName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Name='" + CardName + '\'' +
                '}';
    }
}
