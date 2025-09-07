class Solution {
    public int[] sumZero(int n) {
        int n2[]=new int[n];
        int k=0;
        if(n%2==0){
            for(int i=1;i<(n/2)+1;i++){
                n2[k++]=i;
                n2[k++]=i*(-1);
            }
        }
        else{
            for(int i=1;i<(n/2)+1;i++){
                n2[k++]=i;
                // k+=1;
                n2[k++]=i*(-1);
            }
            n2[k]=0;
        }
        return n2;
    }
}