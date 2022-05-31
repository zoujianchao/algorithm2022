package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/31
 * @description : 40. 组合总和 II
 */
public class LeetCode44 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0, res, new ArrayList<>());
        return res;
    }
    
    private void backtracking(int[] candidates, int target, int sum, int startIndex, List<List<Integer>> res, ArrayList<Integer> list) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            if (i > startIndex && candidates[i] == candidates[i-1]) {
                continue;
            }
            sum += candidates[i];
            list.add(candidates[i]);
            backtracking(candidates, target, sum, i + 1, res, list);
            sum -= candidates[i];
            list.remove(list.size() - 1);
        }
    }
}
