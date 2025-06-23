class Solution {
    public int maxSum(int[] nums) {
        int maxSum=-1;
        for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
            if(i==nums.length-1 && j==nums.length){
                break;
            }
               else if(maximum(nums[i])==maximum(nums[j])){
                    maxSum=Math.max(nums[i]+nums[j],maxSum);
                }
           }
        }
        return maxSum;   
    }
    public static int maximum(int n){
        int temp=n;
        int max=0;
        while(temp!=0){
            max=Math.max(temp%10,max);
            temp/=10;
        }
        return max;
    }
}