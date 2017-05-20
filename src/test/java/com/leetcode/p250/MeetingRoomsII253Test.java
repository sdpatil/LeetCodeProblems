package com.leetcode.p250;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class MeetingRoomsII253Test {
    MeetingRoomsII253 problem;

    @Before
    public void setup(){
        problem = new MeetingRoomsII253();
    }

    @Test
    public void twoMeetingRoomTest(){
        MeetingRoomsII253.Interval[] meetings = new MeetingRoomsII253.Interval[3];
        meetings[0] = new MeetingRoomsII253.Interval(0,30);
        meetings[1] = new MeetingRoomsII253.Interval(5,10);
        meetings[2] = new MeetingRoomsII253.Interval(15,20);

        int result = problem.minMeetingRooms(meetings);
        System.out.println("Result " + result);
        assert result ==2;
    }

    @Test
    public void singleMeetingRoomTest(){
        MeetingRoomsII253.Interval[] meetings = new MeetingRoomsII253.Interval[3];
        meetings[0] = new MeetingRoomsII253.Interval(0,5);
        meetings[1] = new MeetingRoomsII253.Interval(5,10);
        meetings[2] = new MeetingRoomsII253.Interval(15,20);

        int result = problem.minMeetingRooms(meetings);
        System.out.println("Result " + result);
        assert result ==1;
    }

    @Test
    public void zeroMeetingRoomTest(){
        MeetingRoomsII253.Interval[] meetings = new MeetingRoomsII253.Interval[0];


        int result = problem.minMeetingRooms(meetings);
        System.out.println("Result " + result);
        assert result ==0;
    }
}
