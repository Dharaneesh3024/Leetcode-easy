class Solution {
    public int maxArea(int[] height) {
        int n=height.length,ma=0;
        int left=0,right=n-1;
        while(left < right){
            int w=right-left;
            int cA=Math.min(height[left],height[right])*w;
            ma=Math.max(ma,cA);
            if(height[left] < height[right]){
                ++left;
            }
            else if(height[left]==height[right]){
                left++;
                right--;
            }
            else{
                --right;} }
        return ma;}}