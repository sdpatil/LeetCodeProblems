package com.leetcode.p280;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class FindDuplicateNumber287 {
    public int findDuplicate(int[] nums) {
       int n = nums.length;
       int slow =n;
       int fast = n;
       do{
           slow = nums[slow-1];
           fast = nums[nums[fast-1]-1];
       }while (slow != fast);

       slow = n;
       while (slow!=fast){
           slow = nums[slow-1];
           fast = nums[fast-1];
       }
       return slow;
    }
}
