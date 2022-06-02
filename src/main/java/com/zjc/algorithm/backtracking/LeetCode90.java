package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/2
 * @description : 90. 子集 II
 */
public class LeetCode90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        Arrays.sort(nums);
        backtracking(nums, 0, res, list);
        return res;
    }
    
    private void backtracking(int[] nums, int startIndex, List<List<Integer>> res, LinkedList<Integer> list) {
        res.add(new ArrayList<>(list));
        if (startIndex == nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (i > startIndex && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            backtracking(nums, i + 1, res , list);
            list.removeLast();
        }
    }
}
