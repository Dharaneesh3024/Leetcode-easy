class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int i:nums) {
            int max=maximum(i);
            int len=Integer.toString(i).length();
            int val=0;
            for (int j=0;j<len;j++) {
                val=val*10+max;
            }
            sum+=val;
        }
        return sum;
    }

    public static int maximum(int n) {
        int max=0;
        while (n!=0) {
            max=Math.max(n%10,max);
            n/=10;
        }
        return max;
    }
}
