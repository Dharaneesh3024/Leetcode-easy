class Solution {
    public boolean isCircularSentence(String sentence) {
        int n=sentence.length();
        char[] ch=sentence.toCharArray();
        char first=ch[0],last=ch[n-1];
        for(int i=0;i<n;i++){
            if(ch[i]==' '){
                if(ch[i-1]!=ch[i+1]){
                    return false;
                }
            }
        }
        if(first==last){
        return true;
        }
        else{
            return false;
        }
    }
}