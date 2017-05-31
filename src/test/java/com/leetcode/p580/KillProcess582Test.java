package com.leetcode.p580;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class KillProcess582Test {
    KillProcess582 problem;

    @Before
    public void setup(){
        problem = new KillProcess582();
    }

    @Test
    public void simpleTest(){
        List<Integer> pidList = Arrays.asList(1, 3, 10, 5);
        List<Integer> ppidList = Arrays.asList(3, 0, 5, 3);

        List<Integer> returnList = problem.killProcess(pidList,ppidList,5);
        System.out.println(returnList);

        assert returnList.size() ==2;
        assert returnList.contains(5);
        assert returnList.contains(10);
    }

    @Test
    public void simple2Test(){
        List<Integer> pidList = Arrays.asList(1, 3, 10, 5);
        List<Integer> ppidList = Arrays.asList(3, 0, 5, 3);

        List<Integer> returnList = problem.killProcess(pidList,ppidList,3);
        System.out.println(returnList);

        assert returnList.size() ==4;
        assert returnList.contains(5);
        assert returnList.contains(10);
        assert returnList.contains(1);
        assert returnList.contains(3);
    }

    @Test
    public void simple3Test(){
        List<Integer> pidList = Arrays.asList(1, 3, 10, 5);
        List<Integer> ppidList = Arrays.asList(3, 0, 5, 3);

        List<Integer> returnList = problem.killProcess(pidList,ppidList,1);
        System.out.println(returnList);

        assert returnList.size() ==1;
        assert returnList.contains(1);
    }

    @Test
    public void simple8Test(){
        List<Integer> pidList = Arrays.asList(1, 2, 3, 4,5,6,7,8,9,10,11);
        List<Integer> ppidList = Arrays.asList(0,1,1,1,1,1,1,1,1,1,1);

        List<Integer> returnList = problem.killProcess(pidList,ppidList,1);
        System.out.println(returnList);

        assert returnList.size() ==11;
        assert returnList.contains(1);
    }

    @Test
    public void simple157Test(){
        List<Integer> pidList =  Arrays.asList(997,4330,2073,1019,2534,7146,8417,1528,2862,8710,1178,1414,8200,2175,4798,5624,5960,2432,5525,741);
        List<Integer> ppidList = Arrays.asList(177,1206,617,834,2156,2674,4590,1265,1782,6748,840,682,1867,593,3061,2085,3284,1204,5000,713,185);

        List<Integer> returnList = problem.killProcess(pidList,ppidList,1);
        System.out.println(returnList);
    }
}
