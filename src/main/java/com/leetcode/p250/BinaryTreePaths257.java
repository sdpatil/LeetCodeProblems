package com.leetcode.p250;

import com.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 5/17/17.
 */
public class BinaryTreePaths257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> pathList = new ArrayList<String>();
        binaryTreePaths(root, "", pathList);
        return pathList;
    }

    public void binaryTreePaths(TreeNode root, String partialPath, List<String> pathList) {
        if (root == null) {
            return;
        }
        if (!partialPath.equals(""))
            partialPath = partialPath + "->";
        partialPath = partialPath + root.val;

        if (isLeafNode(root)) {
            pathList.add(partialPath);
        } else {
            binaryTreePaths(root.left, partialPath, pathList);
            binaryTreePaths(root.right, partialPath, pathList);
        }


    }

    private boolean isLeafNode(TreeNode root) {
        return root.left == null && root.right == null;
    }

}
