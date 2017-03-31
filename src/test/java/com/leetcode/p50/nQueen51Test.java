package com.leetcode.p50;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class nQueen51Test {
    nQueen51 nQueen51;

    @Before
    public void setup() {
        nQueen51 = new nQueen51();
    }

    @Test
    public void queens4Test() {
        List<List<String>> result = nQueen51.solveNQueens(4);
        System.out.println("Result " + result);
        assert result.size() == 2;
    }

    @Test
    public void queens8Test() {
        List<List<String>> result = nQueen51.solveNQueens(8);
        System.out.println("Result " + result.size());
        for(List<String> board: result)
            System.out.println(board);
    //    assert result.size() == 2;
    }

    @Test
    public void isValidTest() {
        List<Integer> colPosition = new ArrayList<Integer>();

        colPosition.add(1);
        colPosition.add(3);
        colPosition.add(0);
        colPosition.add(2);
        //Should be valid
        assert nQueen51.isValid(colPosition);

        colPosition.add(1);
        colPosition.add(1);
        //Should not be in the same column
        assert !nQueen51.isValid(colPosition);

        colPosition = new ArrayList<Integer>();
        colPosition.add(0);
        colPosition.add(1);

        //Should not be diagonally line
        assert !nQueen51.isValid(colPosition);

        colPosition = new ArrayList<Integer>();
        colPosition.add(1);
        colPosition.add(0);

        //Should not be diagonally line
        assert !nQueen51.isValid(colPosition);
    }
}
