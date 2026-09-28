class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> outer = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        helper(s, outer, list, 0);
        return outer;
    }

    public void helper(String s, List<List<String>> outer, ArrayList<String> list, int idx) {
        if(idx == s.length()) {
            outer.add(new ArrayList(list));
            return;
        }

        for(int i = idx; i < s.length(); i++) {
            String str = s.substring(idx, i + 1);

            if(isPalindrome(str)) {
                list.add(str);
                helper(s, outer, list, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}