package com.example.demo.Pieces;

public class Knight extends Pieces {
    public boolean isMoveValid(int posY, int posX, int newPosY, int newPosX) {
    return super.isMoveValid(posY, posX, newPosY, newPosX) && isKnightMovement(posY,posX,newPosY,newPosX);
    }

    public boolean isKnightMovement(int posY, int posX, int newPosY, int newPosX){
            return (Math.abs(posY-newPosY) == 1 && Math.abs(posX-newPosX)== 1)||(Math.abs(posY-newPosY) == 2 && Math.abs(posX-newPosX) == 1);
    }
}
