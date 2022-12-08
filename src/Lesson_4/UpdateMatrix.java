package Lesson_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class UpdateMatrix {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }

    static int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
    static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static int[][] updateMatrix(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];

        Queue<int[]> q = new LinkedList<>();

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 0) {
                    q.add(new int[]{row, col});
                    visited[row][col] = true;
                }
            }
        }
        int step = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                int[] curPoint = q.poll();
                if (curPoint == null) throw new AssertionError();
                int curRow = curPoint[0];
                int curCol = curPoint[1];
                for (int[] direction : DIRECTIONS) {
                    int newRow = curRow + direction[0];
                    int newCol = curCol + direction[1];
                    if (newRow >= 0 && newRow < mat.length && newCol >= 0 &&
                            newCol < mat[0].length && !visited[newRow][newCol]) {
                        visited[newRow][newCol] = true;
                        mat[newRow][newCol] = step;
                        q.add(new int[]{newRow, newCol});
                    }
                }
            }
            step++;
        }
        return mat;
    }
}

