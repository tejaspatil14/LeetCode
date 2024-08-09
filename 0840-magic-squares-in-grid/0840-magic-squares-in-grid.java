public class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Iterate over all possible top-left corners of 3x3 submatrices
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isMagicSquare(int[][] grid, int startRow, int startCol) {
        // Check if all numbers from 1 to 9 are present exactly once
        boolean[] check = new boolean[10]; // index 0 is unused
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9 || check[num]) {
                    return false;
                }
                check[num] = true;
            }
        }

        // Sum of rows, columns, and diagonals
        int sum = grid[startRow][startCol] + grid[startRow][startCol + 1] + grid[startRow][startCol + 2];

        // Check rows
        for (int i = startRow; i < startRow + 3; i++) {
            if (grid[i][startCol] + grid[i][startCol + 1] + grid[i][startCol + 2] != sum) {
                return false;
            }
        }

        // Check columns
        for (int j = startCol; j < startCol + 3; j++) {
            if (grid[startRow][j] + grid[startRow + 1][j] + grid[startRow + 2][j] != sum) {
                return false;
            }
        }

        // Check diagonals
        if (grid[startRow][startCol] + grid[startRow + 1][startCol + 1] + grid[startRow + 2][startCol + 2] != sum) {
            return false;
        }
        if (grid[startRow][startCol + 2] + grid[startRow + 1][startCol + 1] + grid[startRow + 2][startCol] != sum) {
            return false;
        }

        return true;
    }
}
