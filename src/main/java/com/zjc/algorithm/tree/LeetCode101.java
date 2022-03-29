package com.zjc.algorithm.tree;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/28
 * @description : 对称二叉树
 */
public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        return inorder(root, root);
    }
    
    public static boolean inorder(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        
        if (node1 == null || node2 == null) {
            return false;
        }
        
        return node1.val == node2.val && inorder(node1.left, node2.right) && inorder(node1.right, node2.left);
    }
}

