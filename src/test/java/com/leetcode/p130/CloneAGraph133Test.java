package com.leetcode.p130;

import org.junit.Test;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class CloneAGraph133Test {
    CloneAGraph133 problem = new CloneAGraph133();

    @Test
    public void badInputTest(){
        CloneAGraph133.UndirectedGraphNode root = new CloneAGraph133.UndirectedGraphNode(-1);
        CloneAGraph133.UndirectedGraphNode clonedNode = problem.cloneGraph(null);

        System.out.println(clonedNode);
        assert clonedNode == null;
    }
    @Test
    public void singleNodeNoNeghiborTest(){
        CloneAGraph133.UndirectedGraphNode root = new CloneAGraph133.UndirectedGraphNode(-1);
        CloneAGraph133.UndirectedGraphNode clonedNode = problem.cloneGraph(root);

        System.out.println(clonedNode);
        assert clonedNode.label == -1;
        assert clonedNode.neighbors.size() ==0;
    }

    @Test
    public void singleNodeWithNeighborsTest(){
        CloneAGraph133.UndirectedGraphNode root = new CloneAGraph133.UndirectedGraphNode(-1);
        root.neighbors.add(new CloneAGraph133.UndirectedGraphNode(2));
        CloneAGraph133.UndirectedGraphNode clonedNode = problem.cloneGraph(root);

        System.out.println(clonedNode);
        assert clonedNode.label == -1;
        assert clonedNode.neighbors.size() ==1;
    }
}
