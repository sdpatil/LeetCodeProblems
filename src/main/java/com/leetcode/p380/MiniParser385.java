package com.leetcode.p380;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by sunilpatil on 5/30/17.
 */
public class MiniParser385 {


    public NestedInteger deserialize(String s) {

        char[] c = s.toCharArray();
        StringBuffer partialInt = new StringBuffer();
        Stack<NestedInteger> stack = new Stack<NestedInteger>();
        NestedInteger currentNS =new NestedInteger();

        if(s.charAt(0) != '['){
            int i =0;
            while(i < s.length() && ((Character.getNumericValue(s.charAt(i)) < 10 && Character.getNumericValue(s.charAt(i)) >= 0) || s.charAt(i) == '-')){
                partialInt.append(s.charAt(i));
                i++;
            }
            int num = Integer.parseInt(partialInt.toString());
            return new NestedInteger(num);
        }

        for(int i = 0; i < c.length ;i++){
            if(c[i] == '['){
                NestedInteger n = new NestedInteger();
                currentNS.add(n);
                stack.push(n);
                currentNS = n;
            }else if(c[i] == ']'){
                if(partialInt.length() != 0){
                    int parsedInt = Integer.parseInt(partialInt.toString());
                    stack.peek().setInteger(parsedInt);
                    partialInt = new StringBuffer();
                }
                currentNS = stack.pop();
                //stack.add(stack.pop());
            }else if(c[i] ==','){
                if(partialInt.length() != 0) {
                    int parsedInt = Integer.parseInt(partialInt.toString());
                    stack.peek().setInteger(parsedInt);
                    partialInt = new StringBuffer();
                }
            }else {
                partialInt.append(c[i]);
            }
        }
        if(partialInt.length() != 0)
            currentNS.setInteger(Integer.parseInt(partialInt.toString()));
        return currentNS;
    }
}
