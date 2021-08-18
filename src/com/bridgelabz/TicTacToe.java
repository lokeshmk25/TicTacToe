package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe game");
        GameBoard();
        players();
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};
        printBoard(board);
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
        System.out.println("Enter the option 'X' or 'O' :");
        char player1 = scanner.next().charAt(0);

        if (player1 == 'X') {
            computer = 'O';
        } else {
            player1 = 'O';
            computer = 'X';
        }
        System.out.println("player option is:" + player1);
        System.out.println("computer is:" + computer);
    }

    static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    private static boolean isValidMove(char[][] board, String position) {
        switch (position) {
            case "1":
                return (board[0][0] == ' ');
            case "2":
                return (board[0][1] == ' ');
            case "3":
                return (board[0][2] == ' ');
            case "4":
                return (board[1][0] == ' ');
            case "5":
                return (board[1][1] == ' ');
            case "6":
                return (board[1][2] == ' ');
            case "7":
                return (board[2][0] == ' ');
            case "8":
                return (board[2][1] == ' ');
            case "9":
                return (board[2][2] == ' ');
            default:
                return false;
        }

    }
}
