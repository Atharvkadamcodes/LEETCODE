class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        while(i < sb.length()) {
            if(sb.charAt(i) == '*') {
                sb.delete(i-1, i+1);
                if(i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}