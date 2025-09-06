class Solution {
    public boolean canAliceWin(int[] nums) {
       int s=0; 
       int d=0; 
       for(int i:nums){
            if(i>=10){
                d+=i;
            }
            else{
                s+=i;
            }
       }
       return (!(s==d));
    }
}