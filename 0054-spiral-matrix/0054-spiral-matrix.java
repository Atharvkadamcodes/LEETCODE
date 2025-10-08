class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> spiralMat = new ArrayList<>();
        
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            
            for (int j = left; j <= right; j++) {
                spiralMat.add(matrix[top][j]);
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                spiralMat.add(matrix[i][right]);
            }
            right--;

            
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    spiralMat.add(matrix[bottom][j]);
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralMat.add(matrix[i][left]);
                }
                left++;
            }
        }

        return spiralMat;
    }
}
