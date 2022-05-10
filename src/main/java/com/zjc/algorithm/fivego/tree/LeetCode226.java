package com.zjc.algorithm.fivego.tree;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/10
 * @description : 226. 翻转二叉树
 */
public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }
    public static void reverse(TreeNode root) {
        if(root == null) {
            return;
        }
        TreeNode n = root.left;
        root.left = root.right;
        root.right = n;
        if(root.left != null) {
            reverse(root.left);
        }
        if (root.right != null) {
            reverse(root.right);
        }
    }
}
