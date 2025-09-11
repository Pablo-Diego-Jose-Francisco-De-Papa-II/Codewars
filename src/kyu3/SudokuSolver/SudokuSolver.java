package kyu3.SudokuSolver;

public class SudokuSolver {

    public static int[][] sudoku(int[][] puzzle) {
        solve(puzzle);
        return puzzle;
    }

    public static boolean solve(int[][] puzzle) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (puzzle[row][col] == 0) {

                    for (int num = 1; num <= 9; num++) {

                        if (isValid(puzzle, num, row, col)) {
                            puzzle[row][col] = num;

                            if (solve(puzzle)) {
                                return true;
                            }

                            puzzle[row][col] = 0;
                        }

                    }

                    return false;
                }

            }
        }

        return true;
    }

    private static boolean isNumberInRow(int[][] puzzle, int num, int row) {
        for (int x = 0; x < 9; x++) {
            if (puzzle[row][x] == num) {
                return true;
            }
        }

        return false;
    }

    private static boolean isNumberInCol(int[][] puzzle, int num, int col) {
        for (int y = 0; y < 9; y++) {
            if (puzzle[y][col] == num) {
                return true;
            }
        }

        return false;
    }

    private static boolean isNumberInBox(int[][] puzzle, int num, int row, int col) {
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int x = startRow; x < startRow + 3; x++) {
            for (int y = startCol; y < startCol + 3; y++) {
                if (puzzle[x][y] == num) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isValid(int[][] puzzle, int num, int row, int col) {
        return !isNumberInRow(puzzle, num, row) && !isNumberInCol(puzzle, num, col) && !isNumberInBox(puzzle, num, row, col);
    }

}