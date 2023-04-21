package com.example.demo;

public class FenstringToBoard {
    private String fenstring;

    private static char[][] chessBoard = new char[8][8];


    //8/8/4Rp2/5P2/1PP1pkP1/7P/1P1r4/7K b - - 0 40
    public static void boardBuilder(String fenstring){
        int column = 0;
        int line = 0;
        for (char character: fenstring.toCharArray()) {
            switch (character) {
                case '8', '7', '6', '5', '4', '3', '2', '1': {
                    for (int i = 0; i < Character.getNumericValue(character); i++) {
                        chessBoard[column][line++] = 'e';
                    }
                    break;
                }
                case 'R', 'r', 'K', 'k', 'Q', 'q', 'B', 'b', 'N', 'n', 'P', 'p': {
                    chessBoard[column][line++] = character;
                    break;
                }
                case '/': {
                    line = 0;
                    column++;
                    break;
                }

            }

        }
            for(int i = 0; i<8;i++){
                for(int b = 0; b<8;b++){
                    System.out.print(chessBoard[i][b]);
                }
                System.out.println();
            }
    }



    public static void main(String[] args) {
        boardBuilder("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR");
    }
}
