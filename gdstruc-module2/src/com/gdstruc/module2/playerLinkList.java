package com.gdstruc.module2;

public class playerLinkList {
    private PlayerNode head;
    public int Size = 0;

    public void addToFront(Player player){
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        Size ++;
    }

    public void removeNode (){

        PlayerNode node = head;
        head = head.getNextPlayer();
        Size --;

    }

    public void countNode () {

            System.out.print(Size);

    }

    public void containsNode (Player player) {

        PlayerNode current = head;

        while (current != null) {

            if (current.getPlayer() == player) {
                System.out.print("True");
                return;
            }

            current = current.getNextPlayer();
        }

        System.out.println("False");
    }

    public void indexOfNode (Player player) {

        int index = -1;
        PlayerNode current = head;

        for (int i = 0; i <= Size; i++) {
            if (current.getPlayer() == player) {
                index = i;
                break;
            }
            current = current.getNextPlayer();
        }

        if (index == -1 || index == 0 || index > Size) {
            System.out.print("Index not found");
        } else {
            System.out.print("Index " + index);
        }
    }

        public void printList() {

        PlayerNode current = head;
        System.out.println("Original list: ");
        System.out.print("Head -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

}
