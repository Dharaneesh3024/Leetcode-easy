class Solution {
    public int[] findErrorNums(int[] nums) {
        int left=0;
        int n=nums.length;
        int right=1;
        int rep=0;
        int nxt=0;
        int total=n*(n+1)/2;
        int arraySum=0;
        for(int i:nums){
            arraySum+=i;
        }
        Arrays.sort(nums);
        while(right!=n){
            if(nums[left]==nums[right]){
                rep=nums[left];
                nxt = total-(arraySum-rep);
                return new int[]{rep,nxt};
            }
            else{
                left++;
                right++;
            }
        }
        return nums;
    }
}