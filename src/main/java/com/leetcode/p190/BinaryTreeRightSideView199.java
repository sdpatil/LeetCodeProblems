package com.leetcode.p190;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/13/17.
 */
public class BinaryTreeRightSideView199 {

    private static class LevelOrderTraversalData {
        int level;
        int width;
        TreeNode node;

        public LevelOrderTraversalData(TreeNode node, int level, int width) {
            this.level = level;
            this.width = width;
            this.node = node;
        }

        @Override
        public String toString() {
            return "{" +
                    "level=" + level +
                    ", width=" + width +
                    ", node=" + node.val +
                    '}';
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<LevelOrderTraversalData> queue = new LinkedList<>();
        queue.add(new LevelOrderTraversalData(root, 1, 0));
        List<List<Integer>> levelOrderInts = new ArrayList<>();

        while (!queue.isEmpty()) {
            LevelOrderTraversalData currentData = queue.poll();
            // System.out.println(currentData);
            List<Integer> currentLevel = null;
            if (currentData.level > levelOrderInts.size()) {
                currentLevel = new ArrayList<>();
                levelOrderInts.add(currentLevel);
            } else {
                currentLevel = levelOrderInts.get(currentData.level - 1);
            }

            currentLevel.add(currentData.node.val);
            if (currentData.node.right != null)
                queue.add(new LevelOrderTraversalData(currentData.node.right, currentData.level + 1, currentData.width + 1));
            if (currentData.node.left != null)
                queue.add(new LevelOrderTraversalData(currentData.node.left, currentData.level + 1, currentData.width - 1));
        }
        for (List<Integer> levelInts : levelOrderInts)
            result.add(levelInts.get(0));
        return result;
    }
}
