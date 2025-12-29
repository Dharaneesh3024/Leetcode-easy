class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> s1=new Stack<>();
        Stack <Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' && !s1.isEmpty()){
                s1.pop();
            }
            else{
                s1.push(s.charAt(i));
            }
            if(!s1.isEmpty()){
                char p1=s1.peek();
                 if(p1=='#'){
                s1.pop();
            }     }  
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#' && !s2.isEmpty()){
                s2.pop();
            }
            else{
                s2.push(t.charAt(i));
            }
              if(!s2.isEmpty()){
                char p2=s2.peek();
                 if(p2=='#'){
                s2.pop();
            }  }
        }
        return s1.equals(s2);
    }
}