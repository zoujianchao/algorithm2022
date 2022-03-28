package com.zjc.algorithm.tree;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/28
 * @description :
 */
public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }
    
    public static void reverse(TreeNode node) {
        if (node == null) {
            return;
        }
    
        TreeNode n = node.left;
        node.left = node.right;
        node.right = n;
        
        if (node.left != null) {
            reverse(node.left);
        }
        
        if (node.right != null) {
            reverse(node.right);
        }
    }
}
