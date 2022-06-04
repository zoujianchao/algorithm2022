package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/4 23:09
 * @description : 491. 递增子序列
 */
public class LeetCode491 {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(nums, 0, res, new ArrayList<>());
        return res;
    }

    private void backtracking(int[] nums, int startIndex, List<List<Integer>> res, ArrayList<Integer> list) {
        if (list.size() > 1) {
            res.add(new ArrayList<>(list));
        }

        Set<Integer> set = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++) {
            if (!list.isEmpty() && nums[i] < list.get(list.size() - 1) || set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            list.add(nums[i]);
            backtracking(nums, i + 1, res, list);
            list.remove(list.size() - 1);
        }
    }
}
