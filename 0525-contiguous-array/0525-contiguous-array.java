class Solution {
    public int findMaxLength(int[] nums) {
        int maxSubArrayLen = 0;
        int sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                sum += -1;
            } else {
                sum += nums[i];
            }

            if(!hm.containsKey(sum)) {
                hm.put(sum, i);
            } else {
                int j = hm.get(sum);
                maxSubArrayLen = Math.max(maxSubArrayLen, i - j);
            }
        }

        return maxSubArrayLen;
    }
}