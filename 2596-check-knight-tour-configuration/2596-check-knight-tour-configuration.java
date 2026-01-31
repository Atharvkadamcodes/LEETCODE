class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] != 0) return false;

        int[] row = new int[n * n];
        int[] col = new int[n * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];
                row[v] = i;
                col[v] = j;
            }
        }

        for (int i = 1; i < n * n; i++) {
            int dr = Math.abs(row[i] - row[i - 1]);
            int dc = Math.abs(col[i] - col[i - 1]);

            if (!((dr == 2 && dc == 1) || (dr == 1 && dc == 2))) {
                return false;
            }
        }

        return true;
    }
}