package com.leetcode.p250;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class MeetingRooms252 {
    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                if (o1.start == o2.start)
                    return Integer.compare(o1.end, o2.end);
                return Integer.compare(o1.start, o2.start);
            }
        });
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i].end > intervals[i + 1].start)
                return false;
        }
        return true;
    }
}
