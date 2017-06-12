package com.leetcode.p110;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class PopulatingNextPointersInEachNode116 {
    public void connect(TreeLinkNode root) {
        if(root == null)
            return;

        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            TreeLinkNode node = queue.poll();
            if(node != null){
                node.next = queue.peek();
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);

            }else{
                if(!queue.isEmpty())
                    queue.offer(null);
            }
        }
    }
}
