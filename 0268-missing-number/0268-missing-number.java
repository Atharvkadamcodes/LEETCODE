class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int supposeSum = (n * (n + 1)) / 2;
        int currentSum = 0;
        for(int i=0;i<n;i++){
            currentSum = currentSum + nums[i];
        }

        return supposeSum - currentSum;
    }
}