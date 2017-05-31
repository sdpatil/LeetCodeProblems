package com.leetcode.p380;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Stack;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class MiniParser385Test {

    MiniParser385 problem;

    @Before
    public void setup(){
        problem = new MiniParser385();
    }

    @Test
    public void simpleTest(){
        NestedInteger ns = problem.deserialize("324");
        System.out.println(ns);

    }

    @Test
    public void simple2Test(){
        NestedInteger ns = problem.deserialize("[123,[456,[789]]]");
        System.out.println(ns);
        assert ns.getInteger() == 123;
        //assert ns.get !=null;
        //assert ns.getList().get(0).getInteger() == 456;
        //assert ns.getList().get(0).getList().get(0).getInteger() == 789;

    }

    @Test
    public void simple3Test(){
        NestedInteger ns = problem.deserialize("[123,456,[788,799,833],[[]],10,[]]");

        System.out.println(ns);
    }

    @Test
    public void simple4Test(){
        NestedInteger ns = problem.deserialize("[-1]");
        System.out.println(ns);
    }
}
