package com.leetcode.p170;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class ExcelSheetColumnNumber171Test {
    ExcelSheetColumnNumber171 problem;

    @Before
    public void setup(){
        problem = new ExcelSheetColumnNumber171();
    }

    @Test
    public void simpleTest(){
        System.out.println('A' - 'A'+1);
        assert problem.titleToNumber("A") ==1;
        assert problem.titleToNumber("B") ==2;
        assert problem.titleToNumber("C") ==3;
        assert problem.titleToNumber("Z") ==26;

    }

    @Test
    public void complexTest(){
        System.out.println('A' - 'A'+1);
        assert problem.titleToNumber("AA") ==27;
        assert problem.titleToNumber("AB") ==28;
        assert problem.titleToNumber("ZZ") ==702;

    }
}
