package com.leetcode.p280;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 5/20/17.
 */
public class ZigzagIteratorTest {
    @Test
    public void simpleTest(){
        List<Integer> first = Arrays.asList(1,2);
        List<Integer> second = Arrays.asList(3,4,5,6);
        ZigzagIterator zigzagIterator = new ZigzagIterator(first,second);

        int[] output = new int[6];
        int count = 0;
        while(zigzagIterator.hasNext())
            output[count++] = zigzagIterator.next();

        System.out.println(Arrays.toString(output));
        assert Arrays.equals(output,new int[]{1,3,2,4,5,6});
    }
}
