package com.leetcode.p250;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sunilpatil on 5/31/17.
 */
public class Vector2DTest {


    @Test
    public void simpleTest(){
        List<List<Integer>> vector2DList = new ArrayList<List<Integer>>();
        vector2DList.add(Arrays.asList(1,2));
        vector2DList.add(Arrays.asList(3));
        vector2DList.add(Arrays.asList(4,5,6));

        Vector2D vector2D = new Vector2D(vector2DList);
        while(vector2D.hasNext()){
            System.out.println(vector2D.next());
        }
    }
}
