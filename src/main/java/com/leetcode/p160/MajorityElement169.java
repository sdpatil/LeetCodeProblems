package com.leetcode.p160;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 5/13/17.
 */
public class MajorityElement169 {
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        int ret = 0;
        for(int n : nums){
            if(count == 0) {
                ret = n;
                count=1;
            }if(ret != n)
                count--;
            else
                count++;
        }
        return ret;
    }

    public int majorityElement2(int[] nums) {
        Map<Integer,Integer> elementCountMap = new HashMap<Integer, Integer>();
        for(int n: nums){
            if(elementCountMap.containsKey(n)){
                elementCountMap.put(n,elementCountMap.get(n)+1);
            }else
                elementCountMap.put(n,1);
        }
        for(Map.Entry<Integer,Integer> m: elementCountMap.entrySet()){
            if(m.getValue() > nums.length/2)
                return m.getKey();
        }
        return nums[nums.length/2];
    }
}
