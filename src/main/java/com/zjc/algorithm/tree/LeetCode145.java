package com.zjc.algorithm.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/25
 * @description : 二叉树的后序遍历
 */
public class LeetCode145 {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        postorder(root, list);
//        return list;
//    }
//
//    public static void postorder(TreeNode root, List<Integer> res) {
//        if (root == null) {
//            return;
//        }
//        postorder(root.left, res);
//        postorder(root.right, res);
//        res.add(root.val);
//    }
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
