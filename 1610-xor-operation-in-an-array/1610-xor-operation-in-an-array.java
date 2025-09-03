class Solution {
    public int xorOperation(int n, int start) {
        int res=start;
        int i=0;
        while(i<n-1){
            start+=2;
            res^=start;
            i++;
        }
        return res;

    }
}