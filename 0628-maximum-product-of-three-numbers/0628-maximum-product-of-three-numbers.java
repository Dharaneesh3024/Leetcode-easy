class Solution {
    public int maximumProduct(int[] nums) {
        int i = nums.length - 1;
        Arrays.sort(nums);
        return Math.max((nums[i]) * (nums[i - 1]) * (nums[i - 2]), nums[0] * nums[1] * nums[i]);
    }
}