class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i=0;i<60;i++){
            long res=(long)num1- (long)i*num2;
            if (res<0) continue;
            if (res<i) continue;
            long one=Long.bitCount(res);
            if (one<=i) return i;
        }
        return -1;
    }
}