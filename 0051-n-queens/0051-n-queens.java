import java.util.*;

class Solution {

    List<List<String>> outer = new ArrayList<>();

    public boolean isSafe(char[][] board, int row, int col, int n) {

        for (int i = 0; i < row; i++)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++)
            if (board[i][j] == 'Q') return false;

        return true;
    }

    public void nQueens(char[][] board, int row, int n) {

        // base case
        if (row == n) {
            outer.add(construct(board));
            return;
        }

        //recursion
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';

                nQueens(board, row + 1, n);

                board[row][col] = '.'; // backtrack
            }
        }
    }

    public List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] r : board)
            res.add(new String(r));
        return res;
    }

    public List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        nQueens(board, 0, n);
        return outer;
    }
}
