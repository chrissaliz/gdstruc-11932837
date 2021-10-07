package com.gdstruc.midterms2;

public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(new Player(1, "aceu", 100));
        queue.add(new Player(2, "sinatraa", 100));
        queue.add(new Player(3, "subroza", 95));
        queue.add(new Player(4, "ploo", 90));

        queue.printQueue();

        queue.remove();

        System.out.println("after popping element:");
        queue.printQueue();

    }
}
