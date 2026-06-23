class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> nums[b] - nums[a]);

        int[] ans = new int[nums.length - k + 1];

        for(int i = 0; i < k; i++) {
            pq.offer(i);
        }

        ans[0] = nums[pq.peek()];

        for(int i = k; i < nums.length; i++) {

            pq.offer(i);

            while(!pq.isEmpty() && pq.peek() <= i - k) {
                pq.poll();
            }

            ans[i - k + 1] = nums[pq.peek()];
        }

        return ans;
    }
}