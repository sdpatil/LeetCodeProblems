package com.leetcode.p600;

/**
 * Created by sunilpatil on 6/11/17.
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) {
            if (n == 0)
                return false;
        }
        for (int i = 0; i < flowerbed.length && n >=0; i++) {
            if (flowerbed[i] == 0 ) {
                if(i == 0){
                    if(flowerbed.length == 1)
                        n--;
                    else if(flowerbed[i+1] == 0){
                        n--;
                        i++;
                    }
                }else if( i == flowerbed.length-1){
                    if(flowerbed[i-1] == 0){
                        n--;
                        i++;
                    }
                }else {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        n--;
                        i++;
                    }
                }
            }

        }
        return n <= 0;
    }
}
