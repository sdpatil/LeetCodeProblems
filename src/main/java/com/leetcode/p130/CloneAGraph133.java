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
        if(node == null)
            return null;
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        Map<UndirectedGraphNode,UndirectedGraphNode> originalToClonedMap = new HashMap<>();
        queue.add(node);
        originalToClonedMap.put(node,new UndirectedGraphNode(node.label));
        while (!queue.isEmpty()){
            UndirectedGraphNode originalNode = queue.poll();
            UndirectedGraphNode clonedNode = originalToClonedMap.get(originalNode);
            for(UndirectedGraphNode neighbors: originalNode.neighbors) {
                UndirectedGraphNode clonedNeighbor = originalToClonedMap.get(neighbors);
                if (clonedNeighbor == null) {
                    clonedNeighbor = new UndirectedGraphNode(neighbors.label);
                    originalToClonedMap.put(neighbors, clonedNeighbor);
                    queue.add(neighbors);
                }
                clonedNode.neighbors.add(clonedNeighbor);
            }

        }
        return originalToClonedMap.get(node);
    }
}
