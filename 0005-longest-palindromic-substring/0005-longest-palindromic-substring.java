class Solution {
    public boolean seePalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while(left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        String longest = "";

        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                String str = s.substring(i, j);

                if(seePalindrome(str)) {
                    if(str.length() > longest.length()) {
                        longest = str;
                    }
                }
            }
        }

        return longest;
    }
}