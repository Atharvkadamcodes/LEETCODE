class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums.length];

        Arrays.fill(ans, -1);

        for(int i = 2 * nums.length - 1; i >= 0; i--) {
            int idx = i % nums.length;
            while(!st.isEmpty() && st.peek() <= nums[idx]) {
                st.pop();
            }

            if(i < nums.length && !st.isEmpty()) {
                ans[idx] = st.peek();
            }

            st.push(nums[idx]);
        }

        return ans;
    }
}