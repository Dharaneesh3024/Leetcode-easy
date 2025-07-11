class Solution {
    public boolean squareIsWhite(String coordinates) {
        int r=coordinates.charAt(0)-'a'+1;
        int c=coordinates.charAt(1)-'0';
        return (r+c)%2!=0;
        
    }
}