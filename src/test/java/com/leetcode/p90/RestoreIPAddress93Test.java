package com.leetcode.p90;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/25/17.
 */
public class RestoreIPAddress93Test {
    RestoreIPAddress93 problem;

    @Before
    public void setup(){
        problem = new RestoreIPAddress93();
    }

    @Test
    public void simpleTest(){
        List<String> ipAddressList= problem.restoreIpAddresses("25525511135");
        System.out.println(ipAddressList);
        assert ipAddressList.size() == 2;
        assert ipAddressList.contains("255.255.11.135");
        assert ipAddressList.contains("255.255.111.35");

    }

    @Test
    public void allZerosTest(){
        List<String> ipAddressList= problem.restoreIpAddresses("0000");
        System.out.println(ipAddressList);
        assert ipAddressList.size() == 1;
        assert ipAddressList.contains("0.0.0.0");

    }

    @Test
    public void leadingZeroTest(){
        List<String> ipAddressList= problem.restoreIpAddresses("010010");
        System.out.println(ipAddressList);
        assert ipAddressList.size() == 2;
        assert ipAddressList.contains("0.10.0.10");
        assert ipAddressList.contains("0.100.1.0");

    }


}
