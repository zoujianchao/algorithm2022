package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/5 20:58
 * @description : 46. 全排列
 */
public class LeetCode46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list= new ArrayList<>();
        backtracking(nums, res, list);
        return res;
    }

    private void backtracking(int[] nums, List<List<Integer>> res, List<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            backtracking(nums, res, list);
            list.remove(list.size() - 1);
        }
    }
}
