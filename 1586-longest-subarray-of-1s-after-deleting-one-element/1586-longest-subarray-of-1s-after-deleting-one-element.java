class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,count=0;
        int n=nums.length;
        int max_val=0;
        while(j<n){
            if(nums[j]==0){
                count++;
            }
            while(count>1){
                if(nums[i]==0){
                    count--;
                }
                i++;
            }
            max_val=Math.max(max_val,j-i);
            j++;
        }
        return max_val;
    }
}