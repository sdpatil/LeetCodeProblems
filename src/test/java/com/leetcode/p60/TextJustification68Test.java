package com.leetcode.p60;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 7/5/17.
 */
public class TextJustification68Test {
    TextJustification68 problem = new TextJustification68();

    @Test
    public void simpleTest(){
        String[] input = {"This", "is", "an", "example", "of", "text", "justification."};
        List<String> result =  problem.fullJustify(input,16);
        for(String str: result)
            System.out.println(str);
    }
}
