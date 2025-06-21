class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] pre=new int[n];
        int[] suf=new int[n];
        int t1=1;
        int t2=1;
        for(int i=0;i<n;i++){
          
          pre[i]=t1;
          t1*=nums[i];
    }
        for(int i=n-1;i>=0;i--){
          
          suf[i]=t2;
          t2*=nums[i];
    }
    for(int i=0;i<n;i++){
        pre[i]*=suf[i];
    }
    return pre;
}}