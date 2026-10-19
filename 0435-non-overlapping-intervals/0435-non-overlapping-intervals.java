class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i - 1][1] > intervals[i][0]) {
                count++;
            }
        }

        return count;
    }
}