package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        player asuna = new player(1, "Asuna", 100);
        player lethalBacon = new player(2, "LethalBacon", 205);
        player hpDeskjet = new player(3, "HpDeskJet", 34);

        playerLinkList playerLinkList = new playerLinkList();

        playerLinkList.addToFront(asuna);
        playerLinkList.addToFront(lethalBacon);
        playerLinkList.addToFront(hpDeskjet);

        playerLinkList.printList();
    }
}
