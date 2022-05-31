package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/31
 * @description : 39. 组合总和
 */
public class LeetCode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        Arrays.sort(candidates);
        backtracking(candidates, target, 0,0, res, list);
        return res;
    }
    
    public void backtracking(int[] candidates, int target, int sum, int startIndex, List<List<Integer>> res, LinkedList<Integer> list) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (sum + candidates[i] > target) {
                break;
            }
            sum += candidates[i];
            list.add(candidates[i]);
            backtracking(candidates, target, sum, i, res, list);
            sum -= candidates[i];
            list.removeLast();
        }
    }
}
