class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int res=0;
        for(int i:nums){
            res+=(i-min);
        }
        return res;
    }
}