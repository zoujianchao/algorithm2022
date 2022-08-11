package com.zjc.algorithm.everyday;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/6 19:33
 * @description : 1408. 数组中的字符串匹配
 */
public class LeetCode1408 {
    public List<String> stringMatching(String[] words) {
        List<String> res= new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                if (words[i].contains(words[j])) {
                    if (!res.contains(words[j])) {
                        res.add(words[j]);
                    }
                }
            }
        }

        return res;
    }
}
