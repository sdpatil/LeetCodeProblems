package com.leetcode.p140;

import java.util.HashMap;

/**
 * Created by sunilpatil on 5/25/17.
 */
public class LRUCache {
    private int capacity;
    HashMap<Integer, DLLListNode> map = new HashMap<Integer, DLLListNode>();
    DLLListNode head,tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new DLLListNode(Integer.MIN_VALUE, Integer.MIN_VALUE, null, null);
        tail = new DLLListNode(Integer.MIN_VALUE, Integer.MIN_VALUE, head, null);
        head.next = tail;
    }
    public int get(int key) {
        if (map.containsKey(key)) {
            DLLListNode node = map.get(key);
            remove(node);setHead(node);
            return node.value;
        }
        return -1;
    }
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            DLLListNode node = map.get(key);
            node.value = value;
            remove(node);setHead(node);
        } else {
            DLLListNode created = new DLLListNode(key, value);
            if (map.size() >= capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);setNewlyCreatedHead(created);
            } else {
                setNewlyCreatedHead(created);
            }
            map.put(key, created);
        }
    }
    public void setNewlyCreatedHead(DLLListNode n) {
        DLLListNode previousHead = head.next;
        previousHead.prev = n;
        head.next = n;n.prev = head;n.next = previousHead;
    }
    public void setHead(DLLListNode n) {
        DLLListNode nPrevNode = n.prev; DLLListNode nNextNode = n.next;
        nPrevNode.next = nNextNode; nNextNode.prev = nPrevNode;
        DLLListNode preHead = head.next;
        preHead.prev = n; head.next = n; n.prev = head; n.next = preHead;
    }
    public void remove(DLLListNode n) {
        DLLListNode prevN = n.prev; DLLListNode nextN = n.next;
        prevN.next = nextN; nextN.prev = prevN;
    }

    class DLLListNode {
        private int key;
        private int value;

        public DLLListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public DLLListNode(int key, int value, DLLListNode prev, DLLListNode next) {
            this.key = key;
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

        DLLListNode prev;
        DLLListNode next;
    }
}
