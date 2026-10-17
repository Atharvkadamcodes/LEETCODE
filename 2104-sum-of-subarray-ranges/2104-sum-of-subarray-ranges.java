class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int pse[] = new int[n];
        int nse[] = new int[n];

        Arrays.fill(nse, n);
        Arrays.fill(pse, -1);

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            if(!st.isEmpty()) {
                nse[i] = st.peek();
            }

            st.push(i);
        }

        while(!st.isEmpty()) {
            st.pop();
        }

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }

            if(!st.isEmpty()) {
                pse[i] = st.peek();
            }

            st.push(i);
        }

        while(!st.isEmpty()) {
            st.pop();
        }
        
        int ple[] = new int[n];
        int nle[] = new int[n];

        Arrays.fill(nle, n);
        Arrays.fill(ple, -1);

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }

            if(!st.isEmpty()) {
                nle[i] = st.peek();
            }

            st.push(i);
        }

        while(!st.isEmpty()) {
            st.pop();
        }

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }

            if(!st.isEmpty()) {
                ple[i] = st.peek();
            }

            st.push(i);
        }

        long sumSmall = 0;
        long sumLarge = 0;

        for (int i = 0; i < n; i++) {
            long leftSmall = i - pse[i];
            long rightSmall = nse[i] - i;

            long leftLarge = i - ple[i];
            long rightLarge = nle[i] - i;

            sumSmall += (long) nums[i] * leftSmall * rightSmall;
            sumLarge += (long) nums[i] * leftLarge * rightLarge;
        }

        return sumLarge - sumSmall;
    }
}