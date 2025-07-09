class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
             int res=binarySearch(nums,original);
        if(res==-1){
            return original;
        }
        else{
            original=2*original;
        }
        }
        return original;
        
    }

     public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }
}