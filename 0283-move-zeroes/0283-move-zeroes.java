class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        int temp=0;
        int n=nums.length;
        while(right<=n-1){

           if(nums[right]!=0){
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                
           }
           right++;
        }
    }
}