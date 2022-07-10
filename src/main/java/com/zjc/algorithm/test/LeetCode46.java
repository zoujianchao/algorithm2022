package com.zjc.algorithm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/9 19:04
 * @description :
 */
public class LeetCode46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        backtracking(nums, res, list);

        return res;
    }

    private static void backtracking(int[] nums, List<List<Integer>> res, List<Integer> list) {
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

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        permute(nums);

        System.out.println(1 | 0);
        System.out.println(0 | 0);
        System.out.println(0 & 0);
        System.out.println(0 & 1);
        System.out.println(0 | 1);

    }
}
