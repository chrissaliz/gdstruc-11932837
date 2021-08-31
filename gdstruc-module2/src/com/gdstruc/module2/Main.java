package com.gdstruc.module2;

public class Main {

    public static void main(String[] args)
      {

        player dracula = new player(666, "Dracula", 666);
        player asuna = new player(1, "Asuna", 100);
        player lethalBacon = new player(2, "LethalBacon", 205);
        player hpDeskjet = new player(3, "HpDeskJet", 34);

        playerLinkList playerLinkList = new playerLinkList();

        playerLinkList.addToFront(asuna);
        playerLinkList.addToFront(lethalBacon);
        playerLinkList.addToFront(hpDeskjet);
        playerLinkList.addToFront(dracula);

        playerLinkList.printList();

        playerLinkList.removeNode();

        System.out.print("#1 Remove First Element: ");
        playerLinkList.printList();

        System.out.print("#2 Count element:");
        playerLinkList.countNode();

        playerLinkList.containsNode(asuna);


        }
    }


