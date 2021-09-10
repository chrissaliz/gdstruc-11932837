package com.gdstruc.midterms;

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
