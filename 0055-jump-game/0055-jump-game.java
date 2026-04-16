class Solution {
    public boolean canJump(int[] nums) {
        int furthermost = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i <= furthermost) {
                furthermost = Math.max(furthermost, i + nums[i]);
            }
        }

        if(furthermost >= nums.length - 1) return true;

        return false;
    }
}