class Solution {
    public int repeatedStringMatch(String a, String b) {
        String original = a; 
        int count = 1;        
        while (a.length() < b.length()) {
            a += original;
            count++;
        }
        if (a.contains(b)) {
            return count;
        }
        a += original;
        count++;
        if (a.contains(b)) {
            return count;
        }
        return -1;
    }
}
