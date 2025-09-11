class Solution {
    public String sortVowels(String s) {
        List<Integer> ind_arr=new ArrayList<>();
        List<Character> vow_arr=new ArrayList<>();
        char ch[]=s.toCharArray();
        int ind=0;
        for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".contains(String.valueOf(ch[i]))){
                ind_arr.add(i);
                vow_arr.add(ch[i]);}}
        Collections.sort(vow_arr);
        for(int i:ind_arr){
            ch[i]=vow_arr.get(ind++);}
        return new String(ch);
    }}