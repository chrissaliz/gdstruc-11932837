package com.gdstruc.module2;

public class playerLinkList {
    private playerNode head;

    public void addToFront(player player){
        playerNode playerNode = new playerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList() {
        playerNode current = head;
        System.out.print("Head ->");
        while (current!=null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
