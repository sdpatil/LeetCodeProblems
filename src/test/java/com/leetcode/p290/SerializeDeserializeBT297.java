package com.leetcode.p290;

import com.leetcode.BTreePrinter;
import com.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 6/3/17.
 */
public class SerializeDeserializeBT297 {
    Codec codec2;

    @Before
    public void setup(){
        codec2 = new Codec();
    }

    @Test
    public void simpleTest(){
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(13);

        BTreePrinter.printNode(root);
        String serialized = codec2.serialize(root);
        System.out.println("Serialized value " + serialized);

        TreeNode constructedNode = codec2.deserialize(serialized);
        BTreePrinter.printNode(constructedNode);

    }

    @Test
    public void simple2Test(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        BTreePrinter.printNode(root);

        String serialized = codec2.serialize(root);
        System.out.println("Serialized value " + serialized);

        TreeNode constructedNode = codec2.deserialize(serialized);
        BTreePrinter.printNode(constructedNode);
    }
}
