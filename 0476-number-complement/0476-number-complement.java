class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        char ch[]=bin.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='0'){
                ch[i]='1';
            }
            else{
                ch[i]='0';
            }
        }
        String comp=new String(ch);
        return Integer.parseInt(comp,2);
    }
}