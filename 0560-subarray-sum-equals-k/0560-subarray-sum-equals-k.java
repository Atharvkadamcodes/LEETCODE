class Solution {
    public int subarraySum(int[] nums, int k) {
        int currSum = 0;
        int count = 0;

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            currSum = 0;
            for(int j = i; j < prefix.length; j++) {
                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];

                if(currSum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}