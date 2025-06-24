class Solution {
    public int differenceOfSum(int[] nums) {
        int total=0;
        int digitSum=0;
        for(int i:nums){
            total+=i;
        }
        for(int i:nums){
            digitSum+=sums(i);
        }
        return Math.abs(total-digitSum);
    }
    public static int sums(int n){
        int sum2=0;
        while(n!=0){
            sum2+=n%10;
            n/=10;
        }
        return sum2;
    }
}