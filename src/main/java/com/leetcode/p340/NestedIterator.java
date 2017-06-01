package com.leetcode.p340;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * 341. Flatten Nested List Iterator

 * Created by sunilpatil on 5/30/17.
 */
public class NestedIterator implements Iterator<Integer> {
    Stack<NestedInteger> stack = new Stack<NestedInteger>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--)
            stack.push(nestedList.get(i));
    }

    //@Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    // @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            NestedInteger nestedInteger = stack.peek();
            if (nestedInteger.isInteger())
                return true;
            //Its a list so pop all the elements on to the stack
            nestedInteger = stack.pop();
            for (int i = nestedInteger.getList().size() - 1; i >= 0; i--)
                stack.push(nestedInteger.getList().get(i));
        }
        return false;
    }
}
