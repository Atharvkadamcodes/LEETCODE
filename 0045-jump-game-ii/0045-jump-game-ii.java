class Solution {
    public int jump(int[] nums) {
        int furtherMost = 0;
        int currentEnd = 0;
        int jumps = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            furtherMost = Math.max(furtherMost, i + nums[i]);

            if(i == currentEnd) {
                jumps++;
                currentEnd = furtherMost;
            }
        }
 
        return jumps;
    }
}