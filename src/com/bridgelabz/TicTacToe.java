package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game");
        GameBoard();
        players();
    }

    public static char[] GameBoard() {
        //variables
        char[] board = new char[10];

        //loop iterates for 9 times

        for (int index = 1; index < board.length; index++) {
            //assingn empty spaces to character
            board[index] = '_';
        }
        //returning the board
        return board;
    }
    static void players() {
        char computer;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the option 'X' or 'O' :" );
        char player1 = scanner.next().charAt(0);

        if(player1 == 'X' ){
            computer = 'O';
        }else{
            player1 ='O';
            computer = 'X';
        }
        System.out.println("player option is:" +player1);
        System.out.println("computer is:" +computer);
    }
}
