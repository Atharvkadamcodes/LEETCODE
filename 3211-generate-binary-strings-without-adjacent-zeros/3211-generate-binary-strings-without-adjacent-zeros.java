class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(n, list, sb);
        return list;
    }

    public void helper(int n, ArrayList<String> list, StringBuilder sb) {
        if(sb.length() == n) {
            list.add(sb.toString());
            return;
        }

        sb.append('1');
        helper(n, list, sb);
        sb.deleteCharAt(sb.length() - 1);
        
        if(sb.length() == 0 || sb.charAt(sb.length() - 1) == '1') {
            sb.append('0');
            helper(n, list, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}