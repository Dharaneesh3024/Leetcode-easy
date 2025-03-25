class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0;
        int col = 0;
        int x = mat.length;
        int y = mat[0].length;
        int[] res = new int[x * y];
        if (mat == null || mat.length == 0)
            return new int[0];
        for (int i = 0; i < res.length; i++) {
            res[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                if (col == y - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                }

                else {
                    row--;
                    col++;
                }
            } else {
                if (row == x - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}