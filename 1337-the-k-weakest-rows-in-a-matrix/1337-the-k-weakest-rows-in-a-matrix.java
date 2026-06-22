class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        for(int i = 0; i < mat.length; i++) {
            int sum = 0;
            for(int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            pq.add(new int[]{sum, i});
        }

        int[] arr = new int[k];
        for(int i = 0; i < k; i++) {
            int[] curr = pq.remove();
            arr[i] = curr[1];
        }

        return arr;
    }
}