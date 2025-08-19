class Solution {
    public int missingNumber(int[] nums) {
        int count=0;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        for(int i=1;i<=nums.length;i++){
            count+=i;
        }
        return count-sum;
    }
}