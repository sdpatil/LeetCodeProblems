package com.leetcode.p150;

/**
 * Created by sunilpatil on 6/22/17.
 */
public class ReadNCharacters157 {
    public int read(char[] buf, int n) {
        boolean eof = false;      // end of file flag
        int total = 0;            // total bytes have read
        char[] tmp = new char[4]; // temp buffer

        while (!eof && total < n) {
            int count = read4(tmp);

            // check if it's the end of the file
            eof = count < 4;

            // get the actual count
            count = Math.min(count, n - total);

            // copy from temp buffer to buf
            for (int i = 0; i < count; i++)
                buf[total++] = tmp[i];
        }

        return total;
    }

    public int totalCharsInFile = 0;
    public int read4(char[] buf){
       return totalCharsInFile  -4;
    }
}
