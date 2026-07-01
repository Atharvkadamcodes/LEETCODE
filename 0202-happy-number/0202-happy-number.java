class Solution {
    public boolean isHappy(int n) {
        int digit = n;
        HashSet<Integer> seen = new HashSet<>();

        while (digit != 1) {
            if (seen.contains(digit)) {
                return false;
            }

            seen.add(digit);

            int square = 0;

            while (digit > 0) {
                int d = digit % 10;
                square += d * d;
                digit /= 10;
            }
            digit = square;
        }

        return true;
    }
}