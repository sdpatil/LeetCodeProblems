package com.leetcode.p220;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by sunilpatil on 7/1/17.
 */
public class ContainsDuplicateIII220 {
    private long getID(long i, long w) {
        return i < 0 ? (i + 1) / w - 1 : i / w;
    }

    public boolean containsNearbyAlmostDuplicate3(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            Integer s = set.ceiling(nums[i]);
            if (s != null && s <= nums[i] + t) return true;

            // Find the predecessor of current element
            Integer g = set.floor(nums[i]);
            if (g != null && nums[i] <= g + t) return true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    /*
        Problem: Given an array of integers, find out whether there are two distinct indices i and j in the
        array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference
        between i and j is at most k.

        Solution:- Maintain a TreeSet of numbers and check ceiling of current number, So if ceiling is not null
        and the difference between ceiling and current number is less than t then we found match, same way on the floor
        side
     */
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        TreeSet<Long> set = new TreeSet<>();
        for(int i = 0; i < nums.length ;i++){
            Long ceiling = set.ceiling(new Long(nums[i]));
            if(ceiling != null && ceiling - nums[i] <= t )
                return true;
            Long floor = set.floor(new Long(nums[i]));
            if(floor != null && nums[i] - floor <= t)
                return true;
            set.add(new Long(nums[i]));
            if(i >= k ){
                set.remove(new Long(nums[i-k]));
            }
        }
        return false;
    }

    public static void main(String[] argv){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(4);

        set.add(5);
        System.out.println(set.floor(16));
    }
}