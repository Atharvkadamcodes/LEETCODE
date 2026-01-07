class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[nums.length];
        int index = 0;

        for (int i = 0; i < n; i++) {
            newArr[index++] = nums[i];
            newArr[index++] = nums[i + n];
        }
        return newArr;
    }
}
