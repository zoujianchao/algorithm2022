package com.zjc.algorithm.tree;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/29
 * @description : 二叉树的最小深度
 */
public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right == null) {
            return 1 + minDepth(root.left);
        }
        
        if (root.right != null && root.left == null) {
            return 1 + minDepth(root.right);
        }
        
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
