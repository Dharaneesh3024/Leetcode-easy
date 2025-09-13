class Solution {
    public int maxFreqSum(String s) {
        int freq[]=new int[26];
        int max_vow=0,max_con=0;
        for(char ch:s.toCharArray()){
            int i=ch-'a';
            freq[i]++;
            if("aeiou".contains(String.valueOf(ch))){
                max_vow=Math.max(max_vow,freq[i]);
            }
            else{
                max_con=Math.max(max_con,freq[i]);
            }}
    return max_vow+max_con;
    }}