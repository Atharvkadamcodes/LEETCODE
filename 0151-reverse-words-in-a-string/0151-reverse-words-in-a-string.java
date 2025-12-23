class Solution {
    public String reverseWords(String s) {
        String[] word = s.split("\\s+");
        String ans = new String();
        for(int i = word.length - 1; i >= 0; i--) {
            ans = ans + word[i] + " ";
        }

        return ans.trim();
    }
}