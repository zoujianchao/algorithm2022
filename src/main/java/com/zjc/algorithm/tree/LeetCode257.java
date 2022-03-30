package com.zjc.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/30
 * @description : 二叉树的所有路径
 */
public class LeetCode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        binaryTree(root, "", list);
        return list;
    }
    
    public static void binaryTree(TreeNode root, String path, List<String> list) {
        if (root != null) {
            StringBuilder sb = new StringBuilder(path);
            sb.append(root.val);
            if (root.left == null && root.right == null) {
                list.add(sb.toString());
            }else {
                sb.append("->");
                if (root.left != null) {
                    binaryTree(root.left, sb.toString(), list);
                }
                if (root.right != null) {
                    binaryTree(root.right, sb.toString(), list);
                }
            }
        }
    }
    
}
