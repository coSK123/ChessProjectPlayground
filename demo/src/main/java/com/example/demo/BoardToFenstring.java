package com.example.demo;

public class BoardToFenstring {

    public static String fenstringBuilder(char[][] chessBoard){
        StringBuilder fenstring = new StringBuilder();
        int counter = 0;
        int pawnCounter = 0;
        for(int i = 0; i<8;i++){
            for(int b = 0; b<8;b++){
                switch (chessBoard[i][b]) {
                    case 'e' -> {
                        counter++;
                        pawnCounter++;
                        if (counter == 8) {
                            fenstring.append(pawnCounter).append("/");
                            counter = 0;
                            pawnCounter = 0;
                        }
                    }
                    case 'P', 'p', 'K', 'k', 'Q', 'q', 'N', 'n', 'B', 'b', 'R', 'r' -> {
                        if (pawnCounter != 0) {
                            fenstring.append(pawnCounter).append(chessBoard[i][b]);
                            counter++;
                            pawnCounter = 0;
                        } else {
                            fenstring.append(chessBoard[i][b]);
                            counter++;
                        }
                        if (counter == 8) {
                            fenstring.append("/");
                            counter = 0;
                        }
                    }
                }
            }
        }
        fenstring = new StringBuilder((String) fenstring.subSequence(0, fenstring.length() - 1));
        System.out.println(fenstring);
        return fenstring.toString();
    }
    //rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR
    public static void main(String[] args) {
        fenstringBuilder(FenstringToBoard.boardBuilder("8/8/4Rp2/5P2/1PP1pkP1/7P/1P1r4/7K")); // 8/8/4Rp2/5P2/1PP1pkP1/7P/1P1r4/7K

    }
}
