package com.leetcode.p70;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class SearchA2DMatrix74Test {
    SearchA2DMatrix74 problem = new SearchA2DMatrix74();

    @Test
    public void simpleTest(){
        int[][] matrix = new int[6][5];
        matrix[0] = new int[]{-1, 2, 4, 4, 6};
        matrix[1] = new int[]{1, 5, 5, 9, 21};
        matrix[2] = new int[]{3, 6, 6, 9, 22};
        matrix[3] = new int[]{3, 6, 8, 10, 24};
        matrix[4] = new int[]{6, 8, 9, 12, 25};
        matrix[5] = new int[]{8, 10, 12, 13, 40};

        assert problem.searchMatrix(matrix,8);
        assert !problem.searchMatrix(matrix,7);
    }

    @Test
    public void badInputTest(){
        int[][] matrix = {{}};
        assert !problem.searchMatrix(matrix,0);

    }
}
