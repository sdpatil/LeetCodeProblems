package com.leetcode.p160;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class ExcelSheetColumnTitle168Test {
    ExcelSheetColumnTitle168 problem;

    @Before
    public void setup(){
        problem = new ExcelSheetColumnTitle168();
    }

    @Test
    public void simpleTest(){
        assert problem.convertToTitle(1).equals("A");
        assert problem.convertToTitle(2).equals("B");
        assert problem.convertToTitle(3).equals("C");
        assert problem.convertToTitle(26).equals("Z");

    }

    @Test
    public void complexTest(){
        assert problem.convertToTitle(27).equals("AA");
        assert problem.convertToTitle(28).equals("AB");
        assert problem.convertToTitle(702).equals("ZZ");
    }

    @Test
    public void getCharTest(){
        System.out.println(problem.getChar(26));
    }
}
