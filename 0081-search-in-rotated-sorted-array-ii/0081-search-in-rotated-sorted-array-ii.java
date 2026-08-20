class Solution {
    public boolean search(int[] nums, int target) {
        sort(nums, 0, nums.length - 1);

        int idx = -1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] > nums[i]) {
                idx = i;
            }
        }

        sort(nums, 0, idx);
        sort(nums, idx + 1, nums.length - 1);

        return binary(nums, target);
    }

    public void sort(int[] nums, int left, int right) {
        while(left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public boolean binary(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return true;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}