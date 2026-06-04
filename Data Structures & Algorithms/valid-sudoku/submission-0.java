class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        Set<Character> set;

        // for transvering in ith row
        for(int i = 0 ; i < n ; i++){
            set = new HashSet<>();
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] == '.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }

        // for transversing in ith column
        for(int i = 0 ; i < n ; i++){
            set = new HashSet<>();
            for(int j = 0 ; j < n ; j++){
                if(board[j][i] == '.') continue;
                if(set.contains(board[j][i])) return false;
                set.add(board[j][i]);
            }
        }

        // for transversing in the 3*3 matrix
        for (int box = 0; box < 9; box++) {
            set = new HashSet<>();
            int rowStart = (box / 3) * 3;
            int colStart = (box % 3) * 3;
            for (int i = rowStart; i < rowStart + 3; i++) {
                for (int j = colStart; j < colStart + 3; j++) {
                    if (board[i][j] == '.') continue;
                    if (!set.add(board[i][j])) return false;
                }
            }
        }

        return true;
    }
}