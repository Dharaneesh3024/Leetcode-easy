class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int c=1;c<=n;c++){
            int c2=c*c;
            for(int a=1;a<=n;a++){
                int a2=c2-a*a;
                if(a2<=0) continue;
                int b=(int)Math.sqrt(a2);
                if(b*b==a2 && b<=n){
                    count++;
                }
            }
        }
        return count;
    }
}