package com.zjc.algorithm.test;

import java.util.Arrays;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/23 22:32
 * @description : 6128. 最好的扑克手牌
 */
public class LeetCode6128 {
    public String bestHand(int[] ranks, char[] suits) {
        Arrays.sort(suits);
        Arrays.sort(ranks);
        int countSuits = 1;
        int countRanks = 1;
        int max = 1;
        for (int i = 1; i < suits.length; i++) {
            if (suits[i] != suits[i - 1]) {
                break;
            } else {
                countSuits++;
            }
        }
        if (countSuits == 5) {
            return "Flush";
        }

        for (int i = 1; i < ranks.length; i++) {
            if (ranks[i] == ranks[i - 1]) {
                countRanks++;
            } else {
                countRanks = 1;
            }
            max = Math.max(max, countRanks);
        }

        if (max == 2) {
            return "Pair";
        }
        if (max >= 3) {
            return "Three of a Kind";
        }
        return "High Card";
    }
}
