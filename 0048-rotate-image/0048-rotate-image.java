class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length,col=matrix[0].length;
    
        //reverse
         for (int i = 0; i < row / 2; i++) {
            for (int j = 0; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[row - 1 - i][j];
                matrix[row - 1 - i][j] = temp;
            }
        }


        //transpose
        for(int i=0;i<matrix.length;i++){
        for(int j=i+1;j<matrix.length;j++){
           int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }}

        //print
        for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
            System.out.print(matrix[i][j]);
        }
        System.out.println();
    }
    }
    
}