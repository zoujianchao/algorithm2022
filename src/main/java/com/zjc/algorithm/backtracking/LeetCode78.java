package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/2
 * @description : 78. 子集
 */
public class LeetCode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        backtracking(nums, 0, res, list);
        return res;
    }
    
    private void backtracking(int[] nums, int startIndex, List<List<Integer>> res, LinkedList<Integer> list) {
        res.add(new ArrayList<>(list));
        if (startIndex == nums.length) {
            return;
        }
        
        for (int i = startIndex; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(nums, i + 1, res, list);
            list.removeLast();
        }
    }
}
