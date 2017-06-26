package com.leetcode.p130;

import java.util.*;

/**
 * Created by sunilpatil on 6/26/17.
 */
public class CloneAGraph133 {
    public static class UndirectedGraphNode {
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<>(); }
    }
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        Map<UndirectedGraphNode,UndirectedGraphNode> originalToClonedMap = new HashMap<>();
        queue.add(node);
        originalToClonedMap.put(node,new UndirectedGraphNode(node.label));
        while (!queue.isEmpty()){
            UndirectedGraphNode originalNode = queue.poll();
            UndirectedGraphNode clonedNode = originalToClonedMap.get(originalNode);

            if(clonedNode == null){
                clonedNode = new UndirectedGraphNode(originalNode.label);
                originalToClonedMap.put(originalNode,clonedNode);
            }
            clonedNode.neighbors.add(clonedNode);
        }
        return originalToClonedMap.get(node);
    }
}
