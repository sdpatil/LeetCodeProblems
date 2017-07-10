package com.leetcode.p70;

/**
 * Created by sunilpatil on 5/21/17.
 */
public class WordSearch79 {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        if (board.length * board[0].length < word.length()) {
            return false;
        }

        int rows = board.length;
        int columns = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                boolean[][] mem = new boolean[rows][columns];
                if (exist(i, j, board, mem, word, 0))
                    return true;
            }
        }
        return false;
    }

    public boolean exist(int x, int y, char[][] board, boolean[][] visited, String word, int charIndex) {
        if (word.length() == charIndex)
            return true;
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length)
            return false;
        if (visited[x][y])
            return false;
        char currentChar = word.charAt(charIndex);
        if (board[x][y] != currentChar)
            return false;
        visited[x][y] = true;
        boolean result = exist(x - 1, y, board, visited, word, charIndex + 1) ||
                exist(x + 1, y, board, visited, word, charIndex + 1) ||
                exist(x, y - 1, board, visited, word, charIndex + 1) ||
                exist(x, y + 1, board, visited, word, charIndex + 1);
        if (result == false)
            visited[x][y] = false;

        return result;
    }
}
