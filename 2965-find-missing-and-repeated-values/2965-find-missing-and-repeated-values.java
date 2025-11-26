class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int p = n * n;

        int[] freq = new int[p + 1];
        int duplicate = -1, missing = -1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int val = grid[i][j];
                freq[val]++;

                if(freq[val] == 2) duplicate = val;
            }
        }

        for(int i = 1; i <= p; i++){
            if(freq[i] == 0){
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}
