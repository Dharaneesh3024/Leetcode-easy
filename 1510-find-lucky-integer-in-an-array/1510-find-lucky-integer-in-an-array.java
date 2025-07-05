class Solution {
    public int findLucky(int[] arr) {
        int count=0;
        int res=-1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(arr[i]==count){
                res=arr[i];
            }
        }
        return res;
    }
}