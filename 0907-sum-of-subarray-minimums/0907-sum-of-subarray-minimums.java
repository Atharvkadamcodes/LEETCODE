class Solution {
    public int sumSubarrayMins(int[] arr) {
        int nextMin[] = new int[arr.length];
        int prevMin[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        Arrays.fill(prevMin, -1);
        Arrays.fill(nextMin, n);

        for(int i = n - 1; i >= 0; i--) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            if(!st.isEmpty()) {
                nextMin[i] = st.peek();
            }

            st.push(i);
        } 

        while(!st.isEmpty()) {
            st.pop();
        }

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            if(!st.isEmpty()) {
                prevMin[i] = st.peek();
            }

            st.push(i);
        }

        long sum = 0;
        int mod = 1_000_000_007;
        for (int i = 0; i < n; i++) {
            long L = i - prevMin[i];
            long R = nextMin[i] - i;

            long contribution = (long) arr[i] * L % mod * R % mod;
            sum = (sum + contribution) % mod;
        }

        return (int) sum;
    }
}