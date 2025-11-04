class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(s);
        for(int i = 0; i < order.length(); i++) {
            for(int j = 0; j < sb2.length(); j++) {
                if(order.charAt(i) == sb2.charAt(j)){
                    sb.append(sb2.charAt(j));
                    sb2.deleteCharAt(j);
                    j--;
                }
            }
        }
        sb.append(sb2);
        
        return sb.toString();
    }
}