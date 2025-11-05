class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            int smallest = i;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[smallest] % 2 == 0 || nums[j] % 2 != 0) {
                    smallest = j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

        return nums;
    }
}
