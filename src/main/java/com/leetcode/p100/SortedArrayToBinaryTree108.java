package com.leetcode.p100;

import com.leetcode.TreeNode;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class SortedArrayToBinaryTree108 {

    public TreeNode sortedArrayToBST(int[] nums) {

        return sortedArrayToBST(nums,0, nums.length-1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end){
        if(start > end)
            return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums,start,mid-1);
        root.right = sortedArrayToBST(nums,mid+1,end);
        return root;
    }
}
