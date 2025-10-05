class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] reshapeMat = new int[r][c];
        
         if(n * m != r * c) return mat;

        int index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int newRow = index / c;
                int newCol = index % c;
                reshapeMat[newRow][newCol] = mat[i][j];
                index++;
            
            }
        }
        return reshapeMat;
    }
}