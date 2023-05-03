package com.example.demo;

import com.example.demo.Pieces.Bishop;
import com.example.demo.Pieces.King;
import com.example.demo.Pieces.Queen;
import com.example.demo.Pieces.Rook;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.boardStarter();
        for(int i = 0; i<8; i++) {
            Board board = game.getBoard();
            board.getBoard()[2][6] = new Bishop();
            board.getBoard()[2][6].setBlack(true);
            board.getBoard()[0][3] = new Rook();
            board.getBoard()[0][3].setBlack(true);
            System.out.println( (((King) board.getBoard()[0][4]).isChecked(0,4, board,  board.getBoard()[0][4].getIsBlack())));
        }
    }
}
