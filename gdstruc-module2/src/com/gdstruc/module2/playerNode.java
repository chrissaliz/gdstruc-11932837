package com.gdstruc.module2;

public class playerNode {
    private player player;
    private playerNode nextPlayer;

    public com.gdstruc.module2.player getPlayer() {
        return player;
    }

    public void setPlayer(com.gdstruc.module2.player player) {
        this.player = player;
    }

    public playerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(playerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public playerNode(com.gdstruc.module2.player player) {
        this.player = player;
    }
}
