package com.leetcode.p110;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sunilpatil on 5/24/17.
 */
public class PathSumII113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        List<Integer> partialList = new ArrayList<Integer>();

        pathSum(root,sum,partialList,resultList);
        return resultList;
    }

    public void pathSum(TreeNode root, int sum, List<Integer> partialList, List<List<Integer>> resultList){

        if(root == null)
            return;

        List<Integer> newList = new ArrayList<Integer>(partialList.size()+1);
        newList.addAll(partialList);
        newList.add(root.val);

        if(sum == root.val && root.left == null && root.right == null){
            resultList.add(newList);
            return;
        }

        pathSum(root.left, sum - root.val, newList,resultList);
        pathSum(root.right, sum - root.val, newList,resultList);
    }
}
