package com.zjc.algorithm.fivego.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/10
 * @description : 257. 二叉树的所有路径
 */
public class LeetCode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        binaryTree(root, "", list);
        return list;
    }
    
    public static void binaryTree(TreeNode root, String path, List<String> res) {
        if (root != null) {
            StringBuilder sb = new StringBuilder(path);
            sb.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {
                res.add(sb.toString());
            }else {
                sb.append("->");
                if (root.left != null) {
                    binaryTree(root.left, sb.toString(), res);
                }
                if (root.right != null) {
                    binaryTree(root.right, sb.toString(), res);
                }
            }
        }
    }
}
