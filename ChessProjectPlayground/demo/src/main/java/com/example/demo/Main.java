package com.example.demo;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.boardStarter();
        for(int i = 0; i<8; i++) {
            Board board = game.getBoard();
            System.out.print(board.getBoard()[0][i]);
        }
    }
}
