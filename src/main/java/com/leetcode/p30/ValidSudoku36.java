package com.leetcode.p30;

/**
 * Created by sunilpatil on 6/27/17.
 */
public class ValidSudoku36 {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < board.length; i++)
            if(!isValid(board,i,0,i+1,board.length))
                return false;

        for(int i = 0 ; i < board[0].length; i++)
            if(!isValid(board,0,i,9,i+1))
                return false;

        int regionSize =(int) Math.sqrt(board.length);
        for(int row = 0; row < regionSize ; row++)
            for(int column = 0 ; column <regionSize ; column++){
                if(!isValid(board, row*regionSize, column*regionSize, (row+1)*regionSize,(column+1)*regionSize))
                    return false;
            }

        return true;
    }

    public boolean isValid(char[][] board, int startRow, int startColumn,
                           int endRow, int endColumn){
        System.out.println("Start Row " + startRow + " End Row " + endRow +" Start Column "
                + startColumn +" End Column " + endColumn);
        boolean[] set = new boolean[10];
        for(int row = startRow; row< endRow ;row++ ){
            for (int column = startColumn ; column < endColumn ; column++){
                if(board[row][column] != '.') {
                    int n = Character.getNumericValue(board[row][column]);
                    if (set[n]) {
                        System.out.println("Invalid value at " + row +" " + column);
                        return false;
                    }
                    set[n] = true;
                }
            }
        }
        return true;
    }
}
