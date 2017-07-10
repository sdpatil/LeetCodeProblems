package com.leetcode.p60;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunilpatil on 7/5/17.
 */
public class TextJustification68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int currentLineStart = 0;
        int currentLineLength = 0;
        int numWordsCurrentLine = 0;

        for(int i = 0 ; i < words.length; i++){
            ++numWordsCurrentLine;
            int lookaheadLength  = currentLineLength+ words[i].length()+(numWordsCurrentLine-1);

            if(lookaheadLength == maxWidth){
                String currentLine = joinALineWithSpaces(words,currentLineStart,i, i-currentLineStart);
                result.add(currentLine);
                currentLineStart = i+1;
                currentLineLength = 0;
                numWordsCurrentLine = 0 ;
            }else if(lookaheadLength > maxWidth){
                String currentLine = joinALineWithSpaces(words,currentLineStart,i-1, maxWidth- currentLineLength);
                result.add(currentLine);
                currentLineStart = i;
                numWordsCurrentLine = 1;
                currentLineLength = words[i].length();
            }else{
                currentLineLength = currentLineLength + words[i].length();
            }
        }
        if(numWordsCurrentLine > 0){
            StringBuilder line = new StringBuilder(joinALineWithSpaces(words,currentLineStart,
                    words.length-1, numWordsCurrentLine-1));
            for(int i = 0 ; i < currentLineLength -(numWordsCurrentLine-1);i++)
                line.append(' ');

            result.add(line.toString());
        }
        return result;
    }

    public String joinALineWithSpaces(String[] words, int start, int end, int numSpaces){
        int numberWordsCurrentLine = end - start +1;
        StringBuilder line = new StringBuilder();
        for(int i = start ; i < end ;++i){
            line.append(words[i]);
            int numCurrentSpaces = (int)Math.ceil(numSpaces/numberWordsCurrentLine);
            for(int s = 0 ; s <numCurrentSpaces ; s++)
                line.append(' ');

            numSpaces = numSpaces- numCurrentSpaces;
        }
        line.append(words[end]);
        for(int i = 0 ; i < numSpaces; i++)
            line.append(" ");
        return line.toString();
    }
}
