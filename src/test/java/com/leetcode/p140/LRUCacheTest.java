package com.leetcode.p140;

import org.junit.Test;

/**
 * Created by sunilpatil on 5/25/17.
 */
public class LRUCacheTest {

    @Test
    public void simpleTest(){
        LRUCache lruCache = new LRUCache(5);
        lruCache.put(1,10);
        assert lruCache.get(1) == 10;
        lruCache.put(2,10);
        lruCache.put(3,10);
        lruCache.put(4,10);
        lruCache.put(5,10);

        lruCache.put(6,10);
        assert lruCache.get(1) == -1;

    }

    @Test
    public void simple6Test(){
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2,1);
        lruCache.put(2,2);
        assert lruCache.get(2) == 2;
        lruCache.put(1,1);
        lruCache.put(4,1);
        assert lruCache.get(2) == -1;

    }

    @Test
    public void simple10Test(){
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2,1);
        lruCache.put(3,2);
        assert lruCache.get(3) == 2;
        assert lruCache.get(2) == 1;
        lruCache.put(4,3);
        assert lruCache.get(2) == 1;
        assert lruCache.get(3) == -1;
        assert lruCache.get(4) == 3;
    }
}
