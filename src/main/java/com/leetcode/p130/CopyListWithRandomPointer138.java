package com.leetcode.p130;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class CopyListWithRandomPointer138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode,RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode headX = head;
        while(headX != null){
            RandomListNode cloneNode = new RandomListNode(headX.label);
            map.put(headX,cloneNode);
            headX = headX.next;
        }

        headX = head;
        while(headX != null){
            RandomListNode cloneNode = map.get(headX);
            cloneNode.next = map.get(headX.next);
            cloneNode.random = map.get(headX.random);
            headX = headX.next;
        }

        return map.get(head);
    }
}
