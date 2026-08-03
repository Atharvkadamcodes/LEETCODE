class Solution {
    public void sortColors(int[] nums) {
        int num[] = new int[3];

        for(int i = 0; i < nums.length; i++) {
            int idx = nums[i];
            num[idx]++;
        }

        int index = 0;
        for(int i = 0; i < num[0]; i++) {
            nums[index++] = 0;
        }

        for(int i = 0; i < num[1]; i++) {
            nums[index++] = 1;
        }

        for(int i = 0; i < num[2]; i++) {
            nums[index++] = 2;
        }
    }
}