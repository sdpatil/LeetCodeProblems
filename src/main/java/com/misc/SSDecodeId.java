package com.misc;

/**
 * Created by sunilpatil on 5/11/17.
 */
public class SSDecodeId {

    public static void main(String[] argv) {
        System.out.println("A -> " + ssDecodeColId("A"));
        System.out.println("AA -> " + ssDecodeColId("AA"));
        System.out.println("ZZ -> " + ssDecodeColId("ZZ"));


    }

    public static int ssDecodeColId(final String col) {
        int result = 0;
        for (int i = 0; i < col.length(); i++) {
            result = result*26 + col.charAt(i) - 'A' +1;
        }

        return result;
    }
}
