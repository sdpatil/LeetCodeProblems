package com.leetcode.SingleNumber136;

import com.leetcode.p130.SingleNumber136;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/4/17.
 */
public class SingleNumber136Test {
    SingleNumber136 singleNumber136;
    @Test
    public void simpleTest(){
        int result = singleNumber136.singleNumber(new int[]{1,2,1,2,3});
        System.out.println("Single number " + result);
        assert result == 3;
    }
}
