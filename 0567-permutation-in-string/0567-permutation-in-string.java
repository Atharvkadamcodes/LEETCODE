class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Frequency of s1
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }

        int windowSize = s1.length();

        // First window in s2
        for (int i = 0; i < windowSize; i++) {
            freq2[s2.charAt(i) - 'a']++;
        }

        if (matches(freq1, freq2)) return true;

        // Sliding window
        for (int right = windowSize; right < s2.length(); right++) {

            // Add new character
            freq2[s2.charAt(right) - 'a']++;

            // Remove left character
            freq2[s2.charAt(right - windowSize) - 'a']--;

            if (matches(freq1, freq2)) return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

}