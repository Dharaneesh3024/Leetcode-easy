class Solution {
    public int smallestNumber(int n) {
        int num=1;
        int res=0;
        while(true){
            res = (int) Math.pow(2, num);
            if(res>n){
                res-=1;
                break;
            }
            num+=1;
        }
        return res;
    }
}