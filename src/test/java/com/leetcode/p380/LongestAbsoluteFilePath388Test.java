package com.leetcode.p380;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class LongestAbsoluteFilePath388Test {
    LongestAbsoluteFilePath388 problem;

    @Before
    public void setup(){
        problem = new LongestAbsoluteFilePath388();
    }

    @Test
    public void simpleTest(){
        int result = problem.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");
        System.out.println("Result " + result);
        assert result == 20;
    }

    @Test
    public void simple2Test(){
        int result = problem.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
        System.out.println("Result " + result);
        assert result == 32;
    }
}
