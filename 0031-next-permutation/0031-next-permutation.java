class Solution {
    public void nextPermutation(int[] nums) {
        int checkPoint = -1;
        for(int i = nums.length - 1; i >= 1; i--) {
            if(nums[i] > nums[i - 1]) {
                checkPoint = i - 1;
                break;
            }
        }

        if (checkPoint == -1) {
            Arrays.sort(nums);
            return;
        }

        int smallestIdx = checkPoint + 1;
        for(int i = checkPoint + 1; i < nums.length; i++) {
            if (nums[i] > nums[checkPoint] &&
                nums[i] < nums[smallestIdx]) {

                smallestIdx = i;
            }
        }

        int temp = nums[checkPoint];
        nums[checkPoint] = nums[smallestIdx];
        nums[smallestIdx] = temp;

        Arrays.sort(nums, checkPoint + 1, nums.length);
    }
}