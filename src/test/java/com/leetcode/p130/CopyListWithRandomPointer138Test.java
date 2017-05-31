package com.leetcode.p130;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/26/17.
 */
public class CopyListWithRandomPointer138Test {
    CopyListWithRandomPointer138 problem = new CopyListWithRandomPointer138();

    @Test
    public void simpleTest(){
        RandomListNode randomListNode = new RandomListNode(1);

        randomListNode.next = new RandomListNode(2);
        randomListNode.next.next = new RandomListNode(3);
        randomListNode.next.next.next = new RandomListNode(4);
        randomListNode.next.next.next.next = new RandomListNode(5);

        randomListNode.random = randomListNode.next.next;
        randomListNode.next.random = randomListNode;
        System.out.println(randomListNode);

        RandomListNode copyResult = problem.copyRandomList(randomListNode);
        System.out.println(copyResult);
    }
}
