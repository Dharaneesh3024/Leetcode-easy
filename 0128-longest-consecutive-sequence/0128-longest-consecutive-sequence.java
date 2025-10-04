class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max_count = 1;
        int count = 1;
        int n = nums.length;
        if(n==0){
            return 0;
        }
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else if (nums[i] + 1 == nums[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            max_count = Math.max(count, max_count);
        }
        return max_count;
    }
}