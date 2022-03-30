package com.zjc.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/29
 * @description : 完全二叉树的节点个数
 */
public class LeetCode222 {
//    public int countNodes(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        return 1 + countNodes(root.left) + countNodes(root.right);
//    }
    
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        int res = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
                
                res++;
            }
        }
        return res;
    }
    
}
