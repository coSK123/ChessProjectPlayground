
package com.example.demo;


import com.example.demo.Pieces.*;

import java.util.UUID;

public class Game {
    private Board board;
    private final  String gameId;

    public Game() {
        this.gameId = UUID.randomUUID().toString();
        this.board = new Board("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/R3K2R"); // "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR"
    }

    public String getGameId() {
        return gameId;
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




