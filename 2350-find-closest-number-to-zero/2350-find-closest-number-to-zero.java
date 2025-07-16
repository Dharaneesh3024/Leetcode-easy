class Solution {
    public int findClosestNumber(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                res[i]=nums[i]*-1;
            }
            else{
                res[i]=nums[i];
            }
        }
        Arrays.sort(res);
        for(int i:nums){
            if(i==res[0]){
                return res[0];
            }
        }
        return res[0]*-1;
    }
}