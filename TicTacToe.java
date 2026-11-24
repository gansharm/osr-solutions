import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}
import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

import java.util.Scanner;

public class TicTacToe {

    static char[] board;
    static char currentPlayer;
    static boolean gameRunning;
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        initializeGame();

        while (gameRunning) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", choose a position (1-9):");
            int move = input.nextInt();

            if (isValidMove(move)) {
                board[move - 1] = currentPlayer;
                if (checkWinner()) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false;
                } else if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    gameRunning = false;
                } else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position from 1 to 9.");
            }
        }

        System.out.println();
        System.out.println("Do you want to play again? (yes/no)");
        String again = input.next().toLowerCase();

        if (again.equals("yes")) {
            main(args);
        } else {
            System.out.println("Thanks for playing!");
            input.close();
        }
    }

    public static void initializeGame() {
        board = new char[9];
        for (int i = 0; i < 9; i++) {
            board[i] = (char) ('1' + i);
        }
        currentPlayer = 'X';
        gameRunning = true;
        printWelcomeMessage();
    }

    public static void printWelcomeMessage() {
        System.out.println("=====================================");
        System.out.println("       TIC-TAC-TOE GAME");
        System.out.println("=====================================");
        System.out.println("Players will take turns.");
        System.out.println("Enter a number from 1 to 9 to place your mark.");
        System.out.println("=====================================");
    }

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean isValidMove(int position) {
        if (position < 1 || position > 9) {
            return false;
        }
        return board[position - 1] != 'X' && board[position - 1] != 'O';
    }

    public static boolean checkWinner() {
        return (board[0] == currentPlayer && board[1] == currentPlayer && board[2] == currentPlayer) ||
               (board[3] == currentPlayer && board[4] == currentPlayer && board[5] == currentPlayer) ||
               (board[6] == currentPlayer && board[7] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[3] == currentPlayer && board[6] == currentPlayer) ||
               (board[1] == currentPlayer && board[4] == currentPlayer && board[7] == currentPlayer) ||
               (board[2] == currentPlayer && board[5] == currentPlayer && board[8] == currentPlayer) ||
               (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) ||
               (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                return false;
            }
        }
        return true;
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            temp1 = (temp1 != null) ? temp1.next : headB;
            temp2 = (temp2 != null) ? temp2.next : headA;
        }
        return temp1;
    }
}

public class Solution {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
	if(headA == null || headB == null) return null;
	ListNode temp1 = headA;
	ListNode temp2 = headB;
	while(temp1 != temp2){
		temp1 = (temp1 != null) ? temp1.next : headB;
		temp2 = (temp2 != null) ? temp2.next : headA;
	}
	return temp1;
	}
}
