package com.leetcode.p350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 5/16/17.
 */
public class IntersectionOfTwoArrayII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersections = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = 0;
        int n2 = 0;
        while (n1 < nums1.length && n2 < nums2.length) {
            if (nums1[n1] == nums2[n2]) {
                intersections.add(nums1[n1]);
                n1++;
                n2++;
            }else if (nums1[n1] < nums2[n2]) {
                while (n1 < nums1.length && nums1[n1] < nums2[n2])
                    n1++;
            }else if (nums1[n1] > nums2[n2]) {
                while (n2 < nums2.length && nums2[n2] < nums1[n1])
                    n2++;
            }

        }

        return convertIntegers(intersections);
    }

    public static int[] convertIntegers(List<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
}
