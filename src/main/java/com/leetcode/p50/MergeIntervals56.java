package com.leetcode.p50;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class MergeIntervals56 {

    public List<Interval> merge(List<Interval> intervalList) {
        List<Interval> result = new ArrayList<>();
        if(intervalList.size() == 0)
            return result;
        result.add(intervalList.get(0));
        for (int i = 1; i < intervalList.size(); i++) {
            result = insert(result, intervalList.get(i));
        }
        return result;
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {

        List<Interval> result = new ArrayList<>();

        int i = 0;
        while (i < intervals.size() && intervals.get(i).end < newInterval.start)
            result.add(intervals.get(i++));


        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval = new Interval(Math.min(newInterval.start, intervals.get(i).start),
                    Math.max(newInterval.end, intervals.get(i).end));
            i++;
        }
        result.add(newInterval);
        result.addAll(intervals.subList(i, intervals.size()));
        return result;
    }
}
