class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean found=true;
        while(found){
            found=false;
            for(int i=0; i<nums.length; i++){
            if(original==nums[i]){
                original = 2*original;
                found=true;
                break;
            }
            }
        }
        return original;
        
    }
}