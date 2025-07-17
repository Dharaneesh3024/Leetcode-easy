import java.util.*;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] freq = new int[26];
        for (char c : word1.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : word2.toCharArray()) {
            freq[c - 'a']--;
        }
        for (int f : freq) {
            if (Math.abs(f) > 3) {
                return false;
            }
        }
        return true;
    }
}
