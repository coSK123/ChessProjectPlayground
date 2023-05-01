package com.example.demo.Pieces;

public class Pieces {

    private boolean isBlack;

    public boolean getIsBlack() {
        return isBlack;
    }

    public boolean isMoveValid(int posY, int posX, int newPosY, int newPosX){
        return newPosY <8 && newPosX <8 && !(newPosX == posX && newPosY == posY);

    }


}

