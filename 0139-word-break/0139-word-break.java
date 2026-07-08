class Solution {
    class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        Node() {
            for(int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    Node root = new Node();
    HashMap<String, Boolean> memo = new HashMap<>();

    public void insert(String word) {
        Node curr = root;
        for(int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public boolean search(String key) {
        Node curr = root;
        for(int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    public boolean wordBreakHere(String s) {
        if(s.length() == 0) {
            return true;
        }

        if(memo.containsKey(s)) {
            return memo.get(s);
        }

        for(int i = 1; i <= s.length(); i++) {
            if(search(s.substring(0, i)) && wordBreakHere(s.substring(i))) {
                memo.put(s, true);
                return true;
            }
        }
        memo.put(s, false);

        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        for(int i = 0; i < wordDict.size(); i++) {
            insert(wordDict.get(i));
        }

        return wordBreakHere(s);
    }
}