package com.zjc.algorithm.tree;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/30
 * @description : 相同的树
 */
public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }else if (p == null || q == null) {
            return false;
        }else if (p.val != q.val) {
            return false;
        }else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
