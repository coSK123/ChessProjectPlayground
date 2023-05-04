
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

    public void boardStarter() {
   }


    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(game.board.getBoard()[0][0].getIsBlack());
    }

}




