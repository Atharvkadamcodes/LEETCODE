class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            ans[i] = val;
            ans[i + n] = val;
        }

        return ans;
    }
}