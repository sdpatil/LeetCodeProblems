package com.leetcode.p150;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/29/17.
 */
public class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation problem;

    @Before
    public void setup() {
        problem = new EvaluateReversePolishNotation();
    }

    @Test
    public void simpleTest() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = problem.evalRPN(tokens);
        System.out.println("Result " + result);
        assert result == 9;
    }

    @Test
    public void simple2Test() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        int result = problem.evalRPN(tokens);
        System.out.println("Result " + result);
        assert result == 6;
    }

    @Test
    public void simple3Test() {
        String[] tokens = {"4"};
        int result = problem.evalRPN(tokens);
        System.out.println("Result " + result);
        assert result == 4;
    }

    @Test
    public void simple4Test() {
        String[] tokens = {"0","3","/"};
        int result = problem.evalRPN(tokens);
        System.out.println("Result " + result);
        assert result == 0  ;
    }

}
