package com.gdstruc.module4;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Player[capacity];
    }

    public Player add() {
        Player newRound = new Player();
        int smth = newRound.numberofPlayers();

        if (back == queue.length)
        {
            Player[] newArray = new Player[queue.length*2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        for (int i = 0; i < smth; i++){
            back++;
        }
        System.out.println(smth + " players are in queue.");
        return newRound;
    }

    public Player remove(){
        if (size()==0)
        {
            throw new NoSuchElementException();
        }

        Player removedPlayer = queue[front];
        queue[front] = null;
        front++;

        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return removedPlayer;
    }

    public int size() {
        return back-front;
    }

    public int length() {
        return queue.length;
    }


    public void printQueue()
    {
        System.out.println(size() + " players within the system.");
    }


}
