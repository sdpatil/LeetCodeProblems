package com.leetcode.p70;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class SearchA2DMatrix74 {
    /**
     * Problem:- Given 2D matrix
     * [
     [1,   4,  7, 11, 15],
     [2,   5,  8, 12, 19],
     [3,   6,  9, 16, 22],
     [10, 13, 14, 17, 24],
     [18, 21, 23, 26, 30]
     ]
        check if it has number say 7.

     Solution: - You start by compairing target with matrix[0][n-1] if it matches return true, if does not match
     check if the value is smaller if
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int row = 0;
        int column = matrix[0].length-1;

        while (row < matrix.length && column >= 0){
            if(matrix[row][column] == target)
                return true;
            else if(matrix[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
}
