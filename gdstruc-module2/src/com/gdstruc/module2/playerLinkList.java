package com.gdstruc.module2;

public class playerLinkList {
    private playerNode head;

    public void addToFront(player player){
        playerNode playerNode = new playerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void removeNode (){

        playerNode node = head;
        head = head.getNextPlayer();

    }

    public void countNode () {
        playerNode temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.getNextPlayer();
        }

        System.out.print(count);
    }

    public boolean containsNode (player player) {

        player current = player;

        while (current != null) {

            if (current == player) {
                return true;
            }

        }

        return false;
    }

        public void printList() {

        playerNode current = head;
        System.out.print("Head ->");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }

}
