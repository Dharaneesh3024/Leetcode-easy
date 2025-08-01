class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(temp!=0){
            sum+=temp%10;
            pro*=temp%10;
            temp/=10;
        }
        return pro-sum;
    }
}