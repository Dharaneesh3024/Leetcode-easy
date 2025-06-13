class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder s = new StringBuilder(num);
        int j = s.length() - 1;
        while (j >= 0 && s.charAt(j) == '0') {
            s.deleteCharAt(j);
            j--;
        }
        return s.toString(); 
    }
}
