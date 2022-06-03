package com.zjc.algorithm.tree;

import com.zjc.algorithm.linked.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/31
 * @description : 路径总和 II
 */
public class LeetCode113 {
    //    private  List<List<Integer>> list = new ArrayList<>();
//    private List<Integer> res = new ArrayList<>();
//
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        path(root, 0, targetSum);
//        return list;
//    }
//
//    public void path(TreeNode root, int num, int sum) {
//        if (root == null) {
//            return;
//        }
//        num+=root.val;
//        res.add(root.val);
//        if (root.left == null && root.right == null && sum == num) {
//            list.add(new ArrayList<>(res));
//        }
//        path(root.left, num, sum);
//        path(root.right, num, sum);
//        res.remove(res.size() - 1);
//    }
    private List<List<Integer>> list = new ArrayList<>();
    private List<Integer> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        path(root, 0 , targetSum);
        return list;
    }

    public void path(TreeNode root, int num, int sum) {
        if (root == null) {
            return;
        }
        num+=root.val;
        res.add(root.val);
        if (root.left == null && root.right == null && sum == num) {
            list.add(new ArrayList<>(res));
        }
        path(root.left, num, sum);
        path(root.right, num, sum);
        res.remove(res.size() - 1);
    }
}
