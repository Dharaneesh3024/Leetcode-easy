class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        int res=0;
        for(int i:nums){
            arr[i]++;}
        int max_val=-1;
        for(int i:arr){
            if(i>max_val){
                max_val=i;
            }}
        for(int i:arr){
            if(i==max_val){
                res+=i;
            }}
    return res;}}