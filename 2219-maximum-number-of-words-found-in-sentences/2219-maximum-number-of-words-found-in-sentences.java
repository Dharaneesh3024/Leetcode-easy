class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int count=0;
        for(String s:sentences){
            count=0;
            for(char ch:s.toCharArray()){
                if(ch==' '){
                count++;
            }
            }   
            max=Math.max(max,count); 
        }
        return max+1;
    }
}