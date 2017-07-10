package com.hackerrank.ds.trie;

import org.junit.Test;

import java.util.List;

/**
 * Created by sunilpatil on 7/10/17.
 */
public class ContactTest {
    Contact problem = new Contact();

    @Test
    public void simpleTest(){
        String[] commands = {
                "add hack",
                "add hackerrank",
                "find hac",
                "find hak"
        };

        List<String> result = problem.handleCommand(commands);
        assert result.size() == 2;
        assert result.get(0).equals("2");
        assert result.get(1).equals("0");
    }

    @Test
    public void simple2Test(){
        String[] commands = {
                "add hack",
                "add hacker",
                "add hackerrank",
                "find hac",
                "find h"
        };

        List<String> result = problem.handleCommand(commands);
        System.out.println(result);
        assert result.size() == 2;
        assert result.get(0).equals("3");
        assert result.get(1).equals("3");
    }
}
