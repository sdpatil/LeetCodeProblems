package com.leetcode.p110;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class PopulatingNextPointersInEachNode116Test {
    PopulatingNextPointersInEachNode116 problem;

    @Before
    public void setup(){
        problem = new PopulatingNextPointersInEachNode116();
    }

    @Test
    public void simpleTest(){
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);

        root.right.left =new TreeLinkNode(6);
        root.right.right = new TreeLinkNode(7);

        problem.connect(root);

        System.out.println(root);
    }
}
