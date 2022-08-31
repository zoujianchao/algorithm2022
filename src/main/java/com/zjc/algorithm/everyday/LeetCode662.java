package com.zjc.algorithm.everyday;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/8/27 23:33
 * @description :
 */
public class LeetCode662 {
    public int widthOfBinaryTree(TreeNode root) {
        int result = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(new TreeNode(1, root.left, root.right));
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            int startIndex = -1;
            int endIndex = -1;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                endIndex = treeNode.val;
                if (startIndex == -1) {
                    startIndex = treeNode.val;
                }
                if (treeNode.left != null) {
                    queue.offer(new TreeNode(2 * treeNode.val, treeNode.left.left, treeNode.left.right));
                }
                if (treeNode.right != null) {
                    queue.offer(new TreeNode(2 * treeNode.val + 1, treeNode.right.left, treeNode.right.right));
                }
            }
            result = Math.max(result, endIndex - startIndex + 1);
        }
        return result;
    }
}
