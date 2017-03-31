package com.leetcode.p150;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by sunilpatil on 3/28/17.
 */
public class ReverseWordsInString151Test {
    ReverseWordsInString151 reverseWordsInString151;

    @Before
    public void setup(){
        reverseWordsInString151 = new ReverseWordsInString151();
    }

    @Test
    public void reverseTest(){
        char[] input = "Sunil".toCharArray();
        reverseWordsInString151.reverse(input,0,input.length-1);
        System.out.println(new String(input));
        assert new String(input).equals("linuS");
    }

    @Test
    public void simpleTest(){
        String result = reverseWordsInString151.reverseWords("the sky is blue");
        System.out.println(result);
        assert result.equals("blue is sky the");
    }

    @Test
    public void blankSpaceRerverseTest(){
        String result = reverseWordsInString151.reverseWords(" ");
        System.out.println(result);
        assert result.equals("");
    }

    @Test
    public void blankSpaceInWordsRerverseTest(){
        String result = reverseWordsInString151.reverseWords("   a   b ");
        System.out.println(result);
        assert result.equals("b a");
    }


}
