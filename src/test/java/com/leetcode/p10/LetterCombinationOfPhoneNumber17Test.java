package com.leetcode.p10;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 3/27/17.
 */
public class LetterCombinationOfPhoneNumber17Test {
    LetterCombinationOfPhoneNumber17 letterCombinationOfPhoneNumber17;

    @Before
    public void setup(){
        letterCombinationOfPhoneNumber17 = new LetterCombinationOfPhoneNumber17();
    }

    @Test
    public void simpleTest(){
      List<String> combinations = letterCombinationOfPhoneNumber17.letterCombinations("23");
      System.out.println("Results " + combinations);
      assert combinations.size() ==9;
    }

    @Test
    public void emptyPhoneNumbersTest(){
        List<String> combinations = letterCombinationOfPhoneNumber17.letterCombinations("");
        System.out.println("Results " + combinations);
        assert combinations.size() ==0;
    }
}
