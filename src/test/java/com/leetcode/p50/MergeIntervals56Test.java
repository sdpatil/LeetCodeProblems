package com.leetcode.p50;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class MergeIntervals56Test {
    MergeIntervals56 problem;

    @Before
    public void setup(){
        problem = new MergeIntervals56();
    }

    @Test
    public void simpleTest(){
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1,3));
        intervalList.add(new Interval(2,6));
        intervalList.add(new Interval(8,10));
        intervalList.add(new Interval(15,18));
        List<Interval> resultList = problem.merge(intervalList);
        System.out.println(resultList);
        assert resultList.size() ==3;
    }

    @Test
    public void simple2Test() {
        List<Interval> intervalList = new ArrayList<>();
        List<Interval> resultList = problem.merge(intervalList);
        System.out.println(resultList);
        assert resultList.size() ==0;
    }
}
