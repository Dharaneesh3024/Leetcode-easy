class Solution {
    public String thousandSeparator(int n) {
        String num = Integer.toString(n);
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = num.length() - 1; i >= 0; i--) {
            result.append(num.charAt(i));
            count++;
            if (count % 3 == 0 && i != 0) {
                result.append('.');
            }
        }

        return result.reverse().toString();
    }
}
