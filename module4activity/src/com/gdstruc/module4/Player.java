package com.gdstruc.module4;
import java.util.Random;

public class Player {

    public int numberofPlayers() {
        Random rand = new Random();
        int x = rand.nextInt(7-1) + 1;
        return x;
    }


}
