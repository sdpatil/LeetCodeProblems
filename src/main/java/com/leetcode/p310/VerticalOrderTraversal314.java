package com.leetcode.p310;

import com.leetcode.TreeNode;

import java.util.*;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class VerticalOrderTraversal314 {

    public List<List<Integer>> verticalOrder2(TreeNode root) {
        Map<Integer,
                List<Integer>> verticalOrderMap = new TreeMap<Integer, List<Integer>>();
        verticalOrder(root, 0, verticalOrderMap);
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();

        Iterator<Integer> verticalOrderMapIt = verticalOrderMap.keySet().iterator();
        while (verticalOrderMapIt.hasNext())
            returnList.add(verticalOrderMap.get(verticalOrderMapIt.next()));

        return returnList;
    }

    public void verticalOrder(TreeNode root, int horizontalDistance, Map<Integer,
            List<Integer>> verticalOrderMap) {
        if (root == null)
            return;

        //Found the list for current horizontal distance
        if (verticalOrderMap.containsKey(horizontalDistance)) {
            verticalOrderMap.get(horizontalDistance).add(root.val);
        } else {
            List<Integer> verticalOrderList = new ArrayList<Integer>();
            verticalOrderList.add(root.val);
            verticalOrderMap.put(horizontalDistance, verticalOrderList);
        }
        // horizontal distance goes down by 1 when going left
        verticalOrder(root.left, horizontalDistance - 1, verticalOrderMap);
        // horizontal distance goes up by 1 when going right
        verticalOrder(root.right, horizontalDistance + 1, verticalOrderMap);

    }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root== null)
            return result;

        Map<Integer, List<Integer>> map =new TreeMap<Integer, List<Integer>>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> count = new LinkedList<Integer>();

        queue.add(root);
        count.add(0);
        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            int currentCount = count.poll();

            if (map.containsKey(currentCount)) {
                map.get(currentCount).add(current.val);
            } else {
                List<Integer> verticalOrderList = new ArrayList<Integer>();
                verticalOrderList.add(current.val);
                map.put(currentCount, verticalOrderList);
            }
            if(current.left != null){
                queue.add(current.left);
                count.add(currentCount-1);
            }
            if(current.right != null){
                queue.add(current.right);
                count.add(currentCount+1);
            }
        }

        Iterator<Integer> verticalOrderMapIt = map.keySet().iterator();
        while (verticalOrderMapIt.hasNext())
            result.add(map.get(verticalOrderMapIt.next()));
        return result;
    }
}