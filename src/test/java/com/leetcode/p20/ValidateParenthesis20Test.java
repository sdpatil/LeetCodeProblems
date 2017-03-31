package com.leetcode.p20;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class ValidateParenthesis20Test {
    ValidateParenthesis20 validateParenthesis20;

    @Before
    public void setup(){
        validateParenthesis20 = new ValidateParenthesis20();
    }

    @Test
    public void simplePositiveTest(){
        assert validateParenthesis20.isValid("()");
        assert validateParenthesis20.isValid("()[]{}");
    }

    @Test
    public void simpleNegativeTest(){
        assert !validateParenthesis20.isValid("(]");
        assert !validateParenthesis20.isValid("([)]");
    }
}
