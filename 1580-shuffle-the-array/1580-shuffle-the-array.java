class Solution {
    public int[] shuffle(int[] nums, int n) {
       int len=nums.length;
       int arr[]=new int[len];
       int ind=0;
       for(int i=0;i<len;i++){
        if(i%2==0){
            arr[i]=nums[ind];
            ind++;
        }
        else{
            arr[i]=nums[n];
            n++;
        }
       }
        return arr;
    }
}