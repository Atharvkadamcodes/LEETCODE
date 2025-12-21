class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rowIdx[] = new int[n * m];
        int colIdx[] = new int[n * m];
        int idx = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    rowIdx[idx] = i;
                    colIdx[idx] = j;
                    idx++;
                }
            }
        }

        for(int i = 0; i < idx; i++) {
            int k = rowIdx[i];
            for(int j = 0; j < m; j++) {
                matrix[k][j] = 0;
            }
        }

        for(int i = 0; i < idx; i++) {
            int c = colIdx[i];
            for(int j = 0; j < n; j++) {
                matrix[j][c] = 0;
            }
        }
    }
}