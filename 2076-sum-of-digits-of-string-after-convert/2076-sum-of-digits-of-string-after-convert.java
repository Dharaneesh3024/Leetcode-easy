class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();
        for (char c : s.toCharArray()) {
            num.append(c - 'a' + 1);
        }
        String digits = num.toString();
        for (int i = 0; i < k; i++) {
            digits = String.valueOf(sumOfDigits(digits));
        }
        return Integer.parseInt(digits);
    }

    private int sumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}
