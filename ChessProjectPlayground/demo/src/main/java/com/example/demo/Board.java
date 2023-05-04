
package com.example.demo;
import com.example.demo.Pieces.*;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Arrays;

import static java.lang.Character.isUpperCase;

public class Board {
    private Pieces[][] board;
    private Point king;
    private Point KING;
    private boolean whitesMove;

    public Board(Pieces[][] board) {
        this.board = board;
        KING = new Point();
        king = new Point();
    }

    //8/8/4Rp2/5P2/1PP1pkP1/7P/1P1r4/7K b - - 0 40
    public Board (String fenstring){
        KING = new Point();
        king = new Point();
        int y = 7;
        int x = 0;
        board = new Pieces[8][8];
        for (char character: fenstring.toCharArray()) {
            switch (character) {
                case '8', '7', '6', '5', '4', '3', '2', '1' -> {
                    for (int i = 0; i < Character.getNumericValue(character); i++) {
                        board[y][x++] = null;
                    }
                }
                case 'R', 'r', 'K', 'k', 'Q', 'q', 'B', 'b', 'N', 'n', 'P', 'p' -> {
                    switch (character) {//board[column][line++];
                        case 'R', 'r' -> board[y][x++] = new Rook(!isUpperCase(character));
                        case 'K', 'k' -> {
                            board[y][x] = new King(!isUpperCase(character));
                            if (isUpperCase(character))
                                KING.setLocation(x, y);
                            else king.setLocation(x, y);
                            x++;
                        }
                        case 'Q', 'q' -> board[y][x++] = new Queen(!isUpperCase(character));
                        case 'B', 'b' -> board[y][x++] = new Bishop(!isUpperCase(character));
                        case 'N', 'n' -> board[y][x++] = new Knight(!isUpperCase(character));
                        case 'P', 'p' -> board[y][x++] = new Pawn(!isUpperCase(character));
                    }
                }
                case '/' -> {
                    x = 0;
                    y--;
                }
            }

        }
        for(int i = 0; i<8;i++) {
            for (int b = 0; b < 8; b++) {
                System.out.print(board[i][b]);
            }
            System.out.println();
        }
    }

    public Pieces[][] getBoard() {
        return board;
    }

    public void setBoard(Pieces[][] board) {
        this.board = board;
    }

    public Point get_KING() {
        return KING;
    }

    public void set_KING(Point KING) {
        this.KING = KING;
    }

    public Point get_king() {
        return king;
    }

    public void set_king(Point king) {
        this.king = king;
    }

    public boolean isEmpty( int newPosY, int newPosX) {
        return board[newPosY][newPosX] == null;
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(board) +
                ", king=" + king +
                ", KING=" + KING +
                '}';
    }

    public String toFenString() {
        StringBuilder fenstring = new StringBuilder();
        for(int y = 7; y>=0;y--){
            int emptyCount = 0;
            for(int x = 0; x<8;x++) {
                if (isEmpty(y,x)) {
                    if (x < 7) {
                        emptyCount++;
                    } else {
                        fenstring.append(++emptyCount);
                    }
                } else {
                    if (emptyCount > 0)
                        fenstring.append(emptyCount);
                    fenstring.append(board[y][x].toChar());
                    emptyCount = 0;
                }
            }
            fenstring.append(y > 0 ? '/' : ' ');
        }
        fenstring.append(whitesMove ? 'w' : 'b');
        //fenstring = new StringBuilder((String) fenstring.subSequence(0, fenstring.length() - 1));
        //System.out.println(fenstring);
        return fenstring.toString();
    }
}

