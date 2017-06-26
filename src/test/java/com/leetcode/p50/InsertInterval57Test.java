package com.leetcode.p50;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 6/25/17.
 */
public class InsertInterval57Test {
    InsertInterval57 problem = new InsertInterval57();

    @Test
    public void simpleTest(){
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1,3));
        intervalList.add(new Interval(6,9));

        List<Interval> result= problem.insert(intervalList,new Interval(2,5));

        System.out.println(result);
        assert result.size() == 2;
        assert result.contains(new Interval(1,5));
        assert result.contains(new Interval(6,9));
    }

    @Test
    public void simple2Test(){
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1,2));
        intervalList.add(new Interval(3,5));
        intervalList.add(new Interval(6,7));
        intervalList.add(new Interval(8,10));
        intervalList.add(new Interval(12,16));

        List<Interval> result= problem.insert(intervalList,new Interval(4,9));

        System.out.println(result);
        assert result.size() == 3;
        assert result.contains(new Interval(1,2));
        assert result.contains(new Interval(3,10));
        assert result.contains(new Interval(12,16));
    }

    @Test
    public void simple146Test(){
        List<Interval> intervalList = new ArrayList<>();
        intervalList.add(new Interval(1,5));

        List<Interval> result= problem.insert(intervalList,new Interval(0,1));

        System.out.println(result);
        assert result.size() == 1;
        assert result.contains(new Interval(0,5));
    }

}
