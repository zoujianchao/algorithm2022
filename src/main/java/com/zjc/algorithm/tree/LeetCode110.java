package com.zjc.algorithm.tree;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/29
 * @description : 平衡二叉树
 */
public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        return balanced(root) != -1;
    }
    
    public static int balanced(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = balanced(root.left);
        if (l == -1) {
            return -1;
        }
        int r = balanced(root.right);
        if (r == -1) {
            return -1;
        }
        
        return Math.abs(l - r) > 1 ? -1 : 1 + Math.max(l, r);
    }
}
