class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int[] slot = new int[s.length];

        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < s.length; j++) {
                if(s[j] >= g[i] && slot[j] == 0) {
                    count++;
                    slot[j] = 1;
                    break;
                }
            }
        }

        return count;
    }
}