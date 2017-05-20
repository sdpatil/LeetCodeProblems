package com.leetcode.p250;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class MeetingRooms252Test {
    MeetingRooms252 problem;

    @Before
    public void setup(){
        problem = new MeetingRooms252();
    }

    @Test
    public void simpleNegativeTest(){
        MeetingRooms252.Interval[] meetings = new MeetingRooms252.Interval[3];
        meetings[0] = new MeetingRooms252.Interval(0,30);
        meetings[1] = new MeetingRooms252.Interval(5,10);
        meetings[2] = new MeetingRooms252.Interval(15,20);

        boolean result = problem.canAttendMeetings(meetings);
        System.out.println("Result " + result);
        assert !result;
    }

    @Test
    public void simplePositiveTest(){
        MeetingRooms252.Interval[] meetings = new MeetingRooms252.Interval[3];
        meetings[0] = new MeetingRooms252.Interval(0,5);
        meetings[1] = new MeetingRooms252.Interval(5,10);
        meetings[2] = new MeetingRooms252.Interval(15,20);

        boolean result = problem.canAttendMeetings(meetings);
        System.out.println("Result " + result);
        assert result;
    }

    @Test
    public void noMeetingsTest(){
        MeetingRooms252.Interval[] meetings = new MeetingRooms252.Interval[0];


        boolean result = problem.canAttendMeetings(meetings);
        System.out.println("Result " + result);
        assert result;
    }
}
