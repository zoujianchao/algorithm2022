package com.zjc.algorithm.test;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/9 22:51
 * @description :
 */
public class LeetCode6116 {
//    public boolean evaluateTree(TreeNode root) {
//        if (root.left == null && root.right == null) {
//            return root.val > 0;
//        }
//
//        return switch (root.val) {
//            case 2 -> evaluateTree(root.left) || evaluateTree(root.right);
//            case 3 -> evaluateTree(root.left) && evaluateTree(root.right);
//            default -> false;
//        };
//    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}