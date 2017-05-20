package com.leetcode.p250;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class MeetingRoomsII253 {
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

    public static class EndPoints implements Comparable<EndPoints>{
        int eventTime;
         boolean isStart;

        public EndPoints(int eventTime, boolean isStart) {
            this.eventTime = eventTime;
            this.isStart = isStart;
        }

        public int compareTo(EndPoints o) {
            if(o.eventTime == this.eventTime){
                if(this.isStart && !o.isStart)
                    return 1;
                else if(o.isStart && !this.isStart)
                    return -1;
                else
                    return 0;
            }else
                return Integer.compare(this.eventTime,o.eventTime);
        }
    }

    public int minMeetingRooms(Interval[] intervals) {
        int minMeetingRooms = 0;
        ArrayList<EndPoints> endPointsList = new ArrayList<EndPoints>();
        for(Interval interval: intervals){
            endPointsList.add(new EndPoints(interval.start,true));
            endPointsList.add(new EndPoints(interval.end,false));
        }

        Collections.sort(endPointsList);

        int currentCount = 0;
        for(int i = 0; i < endPointsList.size() ;i++){
            EndPoints endPoints = endPointsList.get(i);
            if(endPoints.isStart){
                currentCount++;
                 minMeetingRooms = Math.max(minMeetingRooms,currentCount);
            }else {
                currentCount--;
            }
        }

        return minMeetingRooms;
    }
}
