class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n / 2];
        int[] negative = new int[n / 2];
        
        int i = 0;
        int j = 0;
        for(int k = 0; k < nums.length; k++) {
            if(nums[k] > 0) {
                positive[i] = nums[k];
                i++;
            }
            else {
                negative[j] = nums[k];
                j++;
            }
        }

        i = 0;
        j = 0;
        for(int k = 0; k < nums.length; k++) {
            if(k % 2 == 0) {
                nums[k] = positive[i];
                i++;
            } else {
                nums[k] = negative[j];
                j++;
            }
        }

        return nums;
    }
}