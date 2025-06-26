class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     for(char c:letters){
        if((int)c-(int)target>=1){
            return c;
        }
     }   
    return letters[0];
    }
}