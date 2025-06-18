class Solution {
    public int[] runningSum(int[] nums) {
        int right=1;
        int left=0;
        while(right!=nums.length){
            nums[right]+=nums[left];
            left++;
            right++;
        }
        return nums;
    }
}