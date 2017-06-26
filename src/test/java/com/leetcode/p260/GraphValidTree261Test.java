package com.leetcode.p260;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/13/17.
 */
public class GraphValidTree261Test {
    GraphValidTree261 problem = new GraphValidTree261();

    @Test
    public void simpleTest(){
        int[][] edgeList = {
                {0,1},
                {0,2},
                {0,3},
                {1,4}
        };

        assert problem.validTree(5, edgeList);
    }

    @Test
    public void simple2Test(){
        int[][] edgeList = {
                {0,1},
                {1,2},
                {2,3},
                {1,3},
                {1,4}
        };

        assert !problem.validTree(5, edgeList);
    }
}
