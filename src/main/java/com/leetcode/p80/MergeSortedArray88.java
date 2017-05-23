package com.leetcode.p80;

/**
 * Created by sunilpatil on 5/22/17.
 */
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0 || nums1.length == 0  || n == 0)
            return;

        int totalIndex = m + n - 1;
        int firstIndex = m - 1;
        int secondIndex = n - 1;
        while (totalIndex >= 0) {
            if (firstIndex < 0) {
                nums1[totalIndex--] = nums2[secondIndex--];
            } else if (secondIndex < 0) {
                nums1[totalIndex--] = nums1[firstIndex--];
            } else if (nums1[firstIndex] >= nums2[secondIndex]) {
                nums1[totalIndex--] = nums1[firstIndex--];
            } else {
                nums1[totalIndex--] = nums2[secondIndex--];
            }
        }
    }
}
