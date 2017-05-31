package com.leetcode.p70;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class SimplifyPath71Test {
    SimplifyPath71 problem;

    @Before
    public void setup(){
        problem = new SimplifyPath71();
    }

    @Test
    public void simpleTest(){
        String result = problem.simplifyPath("/home/");
        System.out.println("Result " + result);
        assert result.equals("/home");
    }

    @Test
    public void simple2Test(){
        String result = problem.simplifyPath("/a/./b/../../c/");
        System.out.println("Result " + result);
        assert result.equals("/c");
    }

    @Test
    public void simple3Test(){
        String result = problem.simplifyPath("/../");
        System.out.println("Result " + result);
        assert result.equals("/");
    }


    @Test
    public void simple4Test(){
        String result = problem.simplifyPath("/home//foo/");
        System.out.println("Result " + result);
        assert result.equals("/home/foo");
    }

    @Test
    public void simple5Test(){
        String result = problem.simplifyPath("/");
        System.out.println("Result " + result);
        assert result.equals("/");
    }
}
