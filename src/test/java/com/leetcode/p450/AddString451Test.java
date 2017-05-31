package com.leetcode.p450;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/31/17.
 */
public class AddString451Test {
    AddString451 problem;

    @Before
    public void setup(){
        problem = new AddString451();
    }

    @Test
    public void simpleTest(){
        assert problem.addStrings("123","123").equals("246");
    }

    @Test
    public void simple2Test(){
        assert problem.addStrings("123","3").equals("126");
        assert problem.addStrings("3","123").equals("126");
    }

    @Test
    public void simple3Test(){
        System.out.println(problem.addStrings("999","999"));
        assert problem.addStrings("999","999").equals("1998");
        assert problem.addStrings("555","555").equals("1110");
    }
}

