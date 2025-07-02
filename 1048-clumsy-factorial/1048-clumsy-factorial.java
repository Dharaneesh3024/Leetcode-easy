class Solution {
    public int clumsy(int n) {
        Stack <Integer> stack=new Stack<>();
        stack.push(n);
        n--;
        int ind=0;
        int res=0;
        while(n>0){
            if(ind%4==0){
                stack.push(stack.pop()*n);
            }
            else if(ind%4==1){
                stack.push(stack.pop()/n);
            }
            else if(ind%4==2){
                stack.push(n);
            }
            else{
                stack.push(-n);
            }
            n--;
            ind++;
        }
        for(int i:stack){
            res+=i;
        }
        return res;
    }
}