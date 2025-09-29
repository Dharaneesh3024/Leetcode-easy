class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int arr[][]=new int[n][n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=count;
                count++;
            }}
            int ind1=0,ind2=0;
        int res=arr[ind1][ind2];
            for(String s:commands){
                if(s.equals("UP")){
                ind1--;
                }
                else if(s.equals("DOWN")){
                    ind1++;
                }
                else if(s.equals("LEFT")){
                    ind2--;
                }
                else if(s.equals("RIGHT")){
                    ind2++;
                }
            }
            return arr[ind1][ind2];
    }
}