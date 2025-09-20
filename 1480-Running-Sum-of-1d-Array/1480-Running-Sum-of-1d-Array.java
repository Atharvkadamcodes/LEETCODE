class Solution {


    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];

        int a = 0;
        for (int i = 0; i < n; i++) {
            sum[i] = a + nums[i];
            a = sum[i];
        }

        return sum;
    }
}