class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int m=name.length(),n=typed.length();
        int left=0,right=0;
        while(left<m && right<n){
            char c1=name.charAt(left),c2=typed.charAt(right);
            if(c1!=c2) return false;
            
            int count1=0;
            while(left<m && name.charAt(left)==c1){
                count1++;
                left++;
            }
            int count2=0;
            while(right<n && typed.charAt(right)==c2){
                count2++;
                right++;
            }
        if(count2<count1) return false;
        }
        return left==m && right==n;  
    }
}