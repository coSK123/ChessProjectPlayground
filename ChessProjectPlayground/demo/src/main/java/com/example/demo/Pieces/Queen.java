package com.example.demo.Pieces;

public class Queen extends Pieces{
    public Queen(boolean black) {
        super(black);
    }

    public boolean isMoveValid(int posY, int posX, int newPosY, int newPosX){

        return super.isMoveValid(posY, posX, newPosY, newPosX) && isQueenMovement(posY,posX,newPosY,newPosX);
    }

    private boolean isQueenMovement(int posY, int posX, int newPosY, int newPosX){
        return (Math.abs(newPosX-posX) == Math.abs(newPosY-posY) )||
                ((posY == newPosY && posX != newPosX) || (posY != newPosY && posX == newPosX));
    }
}
