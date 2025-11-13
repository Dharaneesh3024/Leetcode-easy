class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ind=0;
        int nxt=0;
        int newarr[]=new int[n*2];
        for(int i=0;i<n*2;i++){
            if(i<n){
                newarr[ind]=nums[i];
                ind++;
            }
            else{
                newarr[ind]=nums[nxt];
                ind++;
                nxt++;
            }
        }
            return newarr;
    }
}