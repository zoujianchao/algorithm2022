package com.zjc.algorithm.tree;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/30
 * @description : 路径总和
 */
public class LeetCode112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
