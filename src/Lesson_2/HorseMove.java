package Lesson_2;

import java.util.Arrays;

public class HorseMove {

    public static final int N = 5;
    static int k = 0;

    public static int[][] board;
    public static int[][] steps = {{1, 2}, {-1, 2}, {1, -2}, {-1, -2},
            {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};
    public static int size;

    public static void solveHorseMove(int n) {
        size = n * n;
        board = new int[n][n];
        backTrack(0, 0, 1);
        // инвариант
        // на і шаге і лементов уже отсортированы
    }

    private static void backTrack(int rowStart, int colStart, int stepCount) {

        board[rowStart][colStart] = stepCount;

        if (stepCount == size) {
            print();
            board[rowStart][colStart] = 0;
            return;
        }
        for (int[] step : steps) {
            int newRow = rowStart + step[0];
            int newCol = colStart + step[1];

            if (canPlace(newRow, newCol)) {
                backTrack(newRow, newCol, stepCount + 1);
            }
        }
        board[rowStart][colStart] = 0;
    }


    public static boolean canPlace(int i, int j) {
        return i >= 0 && j >= 0 && i < N && j < N && board[i][j] == 0;
    }

    private static void print() {
        System.out.println("Case " + ++k);
        for (var r : board) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        size = n * n;
        board = new int[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                backTrack(i, j, 1);
            }
        }
    }
}