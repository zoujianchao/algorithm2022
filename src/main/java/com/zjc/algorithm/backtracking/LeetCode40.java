package com.zjc.algorithm.backtracking;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/5 22:19
 * @description : 40. 组合总和 II
 */
public class LeetCode40 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0);
        return res;
    }

    private void backtracking(int[] candidates, int target, int sum, int startIndex) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            if (i > startIndex && candidates[i] == candidates[i - 1]) {
                continue;
            }
            sum+=candidates[i];
            list.add(candidates[i]);
            backtracking(candidates, target, sum, i + 1);
            sum-=candidates[i];
            list.remove(list.size() - 1);
        }
    }

}
