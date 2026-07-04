class Solution {
    public int[][] rotate(int[][] mat) {
        int arr[][] = new int[mat.length][mat[0].length];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                arr[j][mat.length - i - 1] = mat[i][j];
            }
        }

        return arr;
    }

    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0; i < 4; i++) {
            if(Arrays.deepEquals(mat, target)) {
                return true;
            }

            mat = rotate(mat);
        }

        return false;
    }
}