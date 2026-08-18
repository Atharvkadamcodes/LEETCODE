class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        sort(nums, 0, nums.length - 1);
        sort(nums, 0, k - 1);
        sort(nums, k, nums.length - 1);
    }

    public void sort(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}