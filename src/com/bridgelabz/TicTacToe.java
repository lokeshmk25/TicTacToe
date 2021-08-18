package com.bridgelabz;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game");
        GameBoard();
    }

    public static char[] GameBoard() {
        //variables
        char[] board = new char[10];

        //loop iterates for 9 times

        for (int index = 1; index < board.length; index++) {
            //assingn empty spaces to character
            board[index] = ' ';
        }
        //returning the board
        return board;
    }
}
