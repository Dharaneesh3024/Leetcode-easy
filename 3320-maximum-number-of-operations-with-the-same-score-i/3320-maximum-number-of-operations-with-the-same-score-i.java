class Solution {
    public int maxOperations(int[] nums) {
        int sum=nums[0]+nums[1];
        int count=1;
        for(int i=2;i<nums.length-1;){
            if(nums[i]+nums[i+1]==sum){
                count++;
                i+=2;
            }
            else{
                break;
            }
        }
        return count;
    }
}