class Solution {
    public int scoreOfString(String s) {
      int left=0;
      int right=1;
      char[] st=s.toCharArray();
      int sum=0;
      while(right!=s.length()){
        sum+=Math.abs((int)st[left]-(int)st[right]);
        left++;
        right++;
      }  
      return sum;
    }
}