class Solution {
    List<List<String>> outer = new ArrayList<>();

    public boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public void palindrome(String s, List<String> ans, int start) {
        //base case
        if(start == s.length()) {
            outer.add(new ArrayList<>(ans));
            return;
        }

        //recursion

        for(int i = start; i < s.length(); i++) {
            if(isPalindrome(s, start, i)) {
                ans.add(s.substring(start, i + 1));
                palindrome(s, ans, i + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        palindrome(s, new ArrayList<>(), 0);
        return outer;
    }
}