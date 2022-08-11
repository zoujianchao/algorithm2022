package com.zjc.algorithm.second.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/1 22:40
 * @description :
 */
public class LeetCode77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtracking(n, k, 1, res, list);
        return res;
    }

    private void backtracking(int n, int k, int startIndex, List<List<Integer>> res, List<Integer> list) {
        if (k == list.size()) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = startIndex; i <= n - (k - list.size()) + 1; i++) {
            list.add(i);
            backtracking(n, k, i + 1, res, list);
            list.remove(list.size() - 1);
        }
    }
}
