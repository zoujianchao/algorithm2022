package com.zjc.algorithm.fivego.tree;

import javafx.scene.shape.LineTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/10
 * @description : 二叉树的中序遍历 左根右
 */
public class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }
    
    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    
    public List<Integer> inorderTraversal0(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }else {
                curr = stack.pop();
                list.add(curr.val);
                curr = curr.right;
            }
        }
        return list;
    }
}
