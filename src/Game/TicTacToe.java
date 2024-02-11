package Game;

import java.util.*;

public class TicTacToe {

    private boolean flag = true;
    public void start1V1() {
        try (Scanner sc = new Scanner(System.in)) {
            int x, o;
            char[][] board = {
                    { '_', '_', '_' },
                    { '_', '_', '_' },
                    { '_', '_', '_' }
            };

            print(board);

            for (int i = 1; i <= 10; i++) {
                if (i == 10) {
                    System.out.println("Game Daw !!! ");
                    System.out.println("\nGame is created by Prasu Hirpara.\n");
                }
                if (flag) {
                    System.out.print("Enter Co-ordinate of X Player : ");
                    x = sc.nextInt();
                    o = sc.nextInt();

                    while (!isSafe(board, x, o)) {
                        System.out.print("Again enter Co-ordinate of X Player : ");
                        x = sc.nextInt();
                        o = sc.nextInt();
                    }

                    board[x - 1][o - 1] = 'X';

                    print(board);

                    if (isXWon(board)) {
                        System.out.println("Player X Won !!! ");
                        System.out.println("\nGame is created by Prasu Hirpara.\n");
                        return;
                    }

                    flag = false;
                } else {
                    System.out.print("Enter Co-ordinate of O Player : ");
                    x = sc.nextInt();
                    o = sc.nextInt();

                    while (!isSafe(board, x, o)) {
                        System.out.print("Again enter Co-ordinate of O Player : ");
                        x = sc.nextInt();
                        o = sc.nextInt();
                    }

                    board[x - 1][o - 1] = 'O';

                    print(board);

                    if (isOWon(board)) {
                        System.out.println("Player O Won !!! ");
                        System.out.println("\nGame is created by Prasu Hirpara.\n");
                        return;
                    }

                    flag = true;
                }
            }
        }
    }

    public void start1VComp_Begginer() {
        try (Scanner sc = new Scanner(System.in)) {

            int x, o;
            char[][] board = {
                    { '_', '_', '_' },
                    { '_', '_', '_' },
                    { '_', '_', '_' }
            };

            print(board);

            for (int i = 1; i <= 10; i++) {
                if (i == 10) {
                    System.out.println("Game Daw !!! ");
                    System.out.println("\nGame is created by Prasu Hirpara.\n");
                }
                if (flag) {
                    System.out.print("Enter Co-ordinate of X Player : ");
                    x = sc.nextInt();
                    o = sc.nextInt();

                    while (!isSafe(board, x, o)) {
                        System.out.print("Again enter Co-ordinate of X Player : ");
                        x = sc.nextInt();
                        o = sc.nextInt();
                    }

                    board[x - 1][o - 1] = 'X';

                    print(board);

                    if (isXWon(board)) {
                        System.out.println("Player X Won !!! ");
                        System.out.println("\nGame is created by Prasu Hirpara.\n");
                        return;
                    }

                    flag = false;
                } else {
                    System.out.println("Computers Co-ordinate : ");
                    boolean play = true;
                    for (int row = 1; row < 4; row++) {
                        for (int col = 1; col < 4; col++) {
                            if (isSafe(board, row, col)) {
                                board[row - 1][col - 1] = 'X';
                                if (isXWon(board)) {
                                    board[row - 1][col - 1] = 'O';
                                    print(board);
                                    play = false;
                                    break;
                                }
                                board[row - 1][col - 1] = '_';
                            }
                        }
                    }

                    if (play) {
                        Random num = new Random();
                        int row = Math.abs(num.nextInt(3));
                        int col = Math.abs(num.nextInt(3));

                        while (!isSafe(board, row + 1, col + 1)) {
                            row = Math.abs(num.nextInt(3));
                            col = Math.abs(num.nextInt(3));
                        }

                        board[row][col] = 'O';

                        print(board);
                    }

                    if (isOWon(board)) {
                        System.out.println("Computer Won !!! ");
                        System.out.println("\nGame is created by Prasu Hirpara.\n");
                        return;
                    }

                    flag = true;
                }
            }
        }
    }

    public void start1VComp_Intermediate() {
        try (Scanner sc = new Scanner(System.in)) {
            int x, o;
            char[][] board = {
                    { '_', '_', '_' },
                    { '_', '_', '_' },
                    { '_', '_', '_' }
            };

            print(board);

            for (int i = 1; i <= 10; i++) {
                if (i == 10) {
                    System.out.println("Game Daw !!! ");
                    System.out.println("\nGame is created by Prasu Hirpara.\n");
                }
                if (flag) {
                    System.out.print("Enter Co-ordinate of X Player : ");
                    x = sc.nextInt();
                    o = sc.nextInt();

                    while (!isSafe(board, x, o)) {
                        System.out.print("Again enter Co-ordinate of X Player : ");
                        x = sc.nextInt();
                        o = sc.nextInt();
                    }

                    board[x - 1][o - 1] = 'X';

                    print(board);

                    if (isXWon(board)) {
                        System.out.println("Player X Won !!! ");
                        System.out.println("\nGame is created by Prasu Hirpara.\n");
                        return;
                    }

                    flag = false;
                } else {
                    System.out.println("Computers Co-ordinate : ");
                    boolean play = true;

                    for (int row = 1; row < 4; row++) {
                        for (int col = 1; col < 4; col++) {
                            if (isSafe(board, row, col)) {
                                board[row - 1][col - 1] = 'O';
                                if (isOWon(board)) {
                                    board[row - 1][col - 1] = 'O';
                                    print(board);
                                    System.out.println("Computer Won !!!");
                                    System.out.println("\nGame is created by Prasu Hirpara.\n");
                                    return;
                                }
                                board[row - 1][col - 1] = '_';
                            }
                        }
                    }

                    for (int row = 1; row < 4; row++) {
                        if(play){
                            break;
                        }
                        for (int col = 1; col < 4; col++) {
                            if (isSafe(board, row, col)) {
                                board[row - 1][col - 1] = 'X';
                                if (isXWon(board)) {
                                    board[row - 1][col - 1] = 'O';
                                    print(board);
                                    play = false;
                                    break;
                                }
                                board[row - 1][col - 1] = '_';
                            }
                        }
                    }

                    if (play) {
                        Random num = new Random();
                        int row = Math.abs(num.nextInt(3));
                        int col = Math.abs(num.nextInt(3));

                        while (!isSafe(board, row + 1, col + 1)) {
                            row = Math.abs(num.nextInt(3));
                            col = Math.abs(num.nextInt(3));
                        }

                        board[row][col] = 'O';

                        print(board);
                    }

                    if (isOWon(board)) {
                        System.out.println("Computer Won !!! ");
                        System.out.println("\nGame is created by Prasu Hirpara.\n");
                        return;
                    }

                    flag = true;
                }
            }
        }
    }

    private boolean isXWon(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if ((board[0][i] == 'X') && (board[1][i] == 'X') && (board[2][i] == 'X')) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == 'X') && (board[i][1] == 'X') && (board[i][2] == 'X')) {
                return true;
            }
        }
        if ((board[0][0] == 'X') && (board[1][1] == 'X') && (board[2][2] == 'X')) {
            return true;
        }
        return (board[0][2] == 'X') && (board[1][1] == 'X') && (board[2][0] == 'X');
    }

    private boolean isOWon(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if ((board[0][i] == 'O') && (board[1][i] == 'O') && (board[2][i] == 'O')) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == 'O') && (board[i][1] == 'O') && (board[i][2] == 'O')) {
                return true;
            }
        }
        if ((board[0][0] == 'O') && (board[1][1] == 'O') && (board[2][2] == 'O')) {
            return true;
        }
        return (board[0][2] == 'O') && (board[1][1] == 'O') && (board[2][0] == 'O');
    }

    private boolean isSafe(char[][] board, int x, int y) {
        if (x >= 4  || y>= 4 || x <= 0 || y <= 0) {
            return false;
        }
        return board[x - 1][y - 1] == '_';
    }

    private void print(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int s = 0; s < 10; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
