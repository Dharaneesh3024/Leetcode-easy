class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int res=0;
        for(char ch:s.toCharArray()){
            if(ch=='L'){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res+=1;
            }
        }
       
        return res;
    }
}