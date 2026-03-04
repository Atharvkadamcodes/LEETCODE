class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque(nums.length);
        int[] ans = new int[nums.length - k + 1];
        int[] value = new int[k];

        for(int i = 0; i < nums.length; i++) {
            if(!q.isEmpty() && q.peekFirst() == i - k) {
                q.removeFirst();
            }

            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.removeLast();
            }

            q.addLast(i);

            if(i >= k - 1) {
                ans[i - k + 1] = nums[q.peekFirst()];
            }
        }

        return ans;
    }
}