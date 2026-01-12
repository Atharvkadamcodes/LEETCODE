class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int i = 0;

        while(i < n + 1) {
            int x = i;
            int count = 0;

            while(x != 0) {
                count += x & 1;
                x >>= 1;
            }

            ans[i] = count;
            i++;
        }

        return ans;
    }
}