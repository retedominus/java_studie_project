package Lesson_2;

import java.util.Arrays;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, color, oldColor);
        return image;
    }

    private static void dfs(int[][] grid, int i, int j, int mark, int ref) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == mark || grid[i][j] != ref) {
            return;
        }

        grid[i][j] = mark;
        dfs(grid, i + 1, j, mark, ref);
        dfs(grid, i - 1, j, mark, ref);
        dfs(grid, i, j + 1, mark, ref);
        dfs(grid, i, j - 1, mark, ref);
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));
    }
}
