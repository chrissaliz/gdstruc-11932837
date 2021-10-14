package com.gdstruc.module5;

public class Main {

    public static void main(String[] args) {

        Player Dracula = new Player(666, "Dracula", 666);
        Player Alucard = new Player(444, "Alucard", 444);
        Player Trevor = new Player(123, "Trevor", 1);
        Player Sypha = new Player(197, "Sypha", 59);

        SimpleHashtable hashtable = new SimpleHashtable();

        hashtable.put(Dracula.getUserName(), Dracula);
        hashtable.put(Alucard.getUserName(), Alucard);
        hashtable.put(Trevor.getUserName(), Trevor);
        hashtable.put(Sypha.getUserName(), Sypha);


        hashtable.printHashtable();
        System.out.println("\n After removing element Dracula: \n");
        hashtable.remove("Dracula");
        hashtable.printHashtable();
    }
}
