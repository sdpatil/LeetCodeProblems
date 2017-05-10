package com.leetcode.p270;

import org.junit.Test;

/**
 * Created by sunilpatil on 4/25/17.
 */
public class FirstBadVersionTest {
    FirstBadVersion firstBadVersion;

    @Test
    public void simpleTest(){
        FirstBadVersion firstBadVersion = new FirstBadVersion(7);
        System.out.println(firstBadVersion.firstBadVersion(10));
    }

    @Test
    public void singleBadVersionTest(){
        FirstBadVersion firstBadVersion = new FirstBadVersion(1);
        System.out.println(firstBadVersion.firstBadVersion(2));
    }

    @Test
    public void single1BadVersionTest(){
        FirstBadVersion firstBadVersion = new FirstBadVersion(0);
        System.out.println(firstBadVersion.firstBadVersion(1));
    }

    @Test
    public void largeNumberOfVersionsTest(){
        FirstBadVersion firstBadVersion = new FirstBadVersion(1702766719);
        System.out.println(firstBadVersion.firstBadVersion(2126753390));
    }
}
