class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0;
        int col = 0;

        for (String s : commands) {
            char c = s.charAt(0);

            switch (c) {
                case 'U':
                    row--;
                    break;
                case 'D':
                    row++;
                    break;
                case 'R':
                    col++;
                    break;
                case 'L':
                    col--;
                    break;
            }
        }
        return (row * n) + col;
    }
}