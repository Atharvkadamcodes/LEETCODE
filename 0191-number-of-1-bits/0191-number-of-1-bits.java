class Solution {
    public int hammingWeight(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.append(n % 2);
            n = n / 2;
        }
        String result = binary.reverse().toString();

        int count = 0;
        for(int i = 0; i < result.length(); i++) {
            if(result.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}