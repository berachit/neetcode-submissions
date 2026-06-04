class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        Set<Character> set;

        // for transvering in ith row
        for (int i = 0; i < n; i++) {
            set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.')
                    continue;
                if (set.contains(board[i][j]))
                    return false;
                set.add(board[i][j]);
            }
        }

        // for transversing in ith column
        for (int i = 0; i < n; i++) {
            set = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (board[j][i] == '.')
                    continue;
                if (set.contains(board[j][i]))
                    return false;
                set.add(board[j][i]);
            }
        }

        // for transversing in the 3*3 matrix
        for (int i = 0; i < n; i += 3) {
            for (int j = 0; j < n; j += 3) {
                set = new HashSet<>();
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (board[x][y] == '.')
                            continue;
                        if (set.contains(board[x][y]))
                            return false;
                        set.add(board[x][y]);
                    }
                }
            }
        }

        return true;
    }
}