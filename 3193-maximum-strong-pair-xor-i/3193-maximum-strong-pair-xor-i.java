class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        for (int i=0; i<n;i++) {
            for (int j=i;j<n;j++) {
                int a=nums[i];
                int b=nums[j];
                if (Math.abs(a-b)<=Math.min(a,b)) {
                    res=Math.max(res,a^b);
                }
            }
        }
        return res;
    }
}