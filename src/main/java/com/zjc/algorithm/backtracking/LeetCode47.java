package com.zjc.algorithm.backtracking;

import java.util.*;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/5 21:26
 * @description : 47. 全排列 II
 */
public class LeetCode47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtracking(nums, used, res, list);
        return res;
    }

    private void backtracking(int[] nums, boolean[] used, List<List<Integer>> res, List<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                used[i] = true;
                list.add(nums[i]);
                backtracking(nums, used, res, list);
                used[i] = false;
                list.remove(list.size() - 1);
            }

        }
    }

    public static void main(String[] args) {
        boolean[] used = new boolean[3];
        if (used[1]) {
            System.out.println(!used[1]); //false
        }
    }
}
