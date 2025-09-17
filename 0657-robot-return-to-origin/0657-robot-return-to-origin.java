class Solution {
    public boolean judgeCircle(String moves) {
        char ch[]=moves.toCharArray();
        int x=0;
        int y=0;
      for(int i=0;i<ch.length;i++){
        if(ch[i]=='U'){
            y++;
        }
       else if(ch[i]=='D'){
            y--;
        }
       else if(ch[i]=='L'){
            x--;
        }
        else{
            x++;
        }
      
      } 
      return ((x==y) && (x==0)); 
    }
}