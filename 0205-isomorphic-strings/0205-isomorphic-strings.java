class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hmST = new HashMap<>();
        HashMap<Character, Character> hmTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);


            if(hmST.containsKey(c1)) {
                if(hmST.get(c1) != c2) {
                    return false;
                }
            } else {
                hmST.put(c1, c2);
            }

            if(hmTS.containsKey(c2)) {
                if(hmTS.get(c2) != c1) {
                    return false;
                }
            } else {
                hmTS.put(c2, c1);
            }
        }

        return true;
    }
}