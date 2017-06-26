package com.leetcode.p20;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class ImplementStrStr28Test {
    ImplementStrStr28 problem = new ImplementStrStr28();

    @Test
    public void simpleTest(){
       int result= problem.strStr("This is sunil's solution","sunil");
       System.out.println("Result " + result);

    }
}
