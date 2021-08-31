package com.gdstruc.module2;

public class Main {

    public static void main(String[] args)
      {

        Player dracula = new Player(666, "Dracula", 666);
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HpDeskJet", 34);

        playerLinkList playerLinkList = new playerLinkList();

        playerLinkList.addToFront(asuna);
        playerLinkList.addToFront(lethalBacon);
        playerLinkList.addToFront(hpDeskjet);
        playerLinkList.addToFront(dracula);

        playerLinkList.printList();

        playerLinkList.removeNode();

        System.out.print("#1 Remove First Element: ");
        playerLinkList.printList();

        System.out.print("#2 Count element: ");
        playerLinkList.countNode();

        System.out.println("\n#3.1 Contains() function:" );
        playerLinkList.containsNode(asuna);

        System.out.println("\n#3.2 indexOf() function:" );
        playerLinkList.indexOfNode(lethalBacon);




        }
    }


