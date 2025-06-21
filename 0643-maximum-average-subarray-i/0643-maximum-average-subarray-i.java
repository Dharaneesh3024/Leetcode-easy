class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        double max = Integer.MIN_VALUE; 
        int end = k - 1; 
        double sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        max = sum;

        while (end < nums.length - 1) {
           
            sum += nums[end + 1] - nums[start];
            max = Math.max(max, sum);
            start++;
            end++;
        }
        return max / k;
    }
}
