
package com.example.demo;


import com.example.demo.Pieces.*;

public class Game {
    private Board board;

    public Game() {
        this.board = new Board (new Pieces[8][8]);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void boardStarter(){
       Pieces[][] newBoard = new Pieces[8][8];
       newBoard[0][4] = new King( true);


       board.setBoard(newBoard);


   }


    public static void main(String[] args) {
    }

}




