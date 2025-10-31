class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int iIdx[] = new int[n*m];
        int jIdx[] = new int[n*m];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    iIdx[index] = i;
                    jIdx[index] = j;
                    index++;
                }
            }
        }
        
        for (int k = 0; k < index; k++) {
            int r = iIdx[k];
            for (int j = 0; j < m; j++) {
                matrix[r][j] = 0;
            }
        }

    
        for (int k = 0; k < index; k++) {
            int c = jIdx[k];
            for (int i = 0; i < n; i++) {
                matrix[i][c] = 0;
            }
        }

    }
}