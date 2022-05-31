package com.zjc.algorithm.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/31
 * @description : 216. 组合总和 III
 */
public class LeetCode216 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(n, k,0, 1);
        return res;
    }
    
    public void backTracking(int n, int k, int sum, int startIndex) {
        if (sum > n) {
            return;
        }
        if (path.size() == k) {
            if (sum == n) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
            sum+=i;
            path.add(i);
            backTracking(n, k, sum, i + 1);
            sum-=i;
            path.removeLast();
        }
    }
}
