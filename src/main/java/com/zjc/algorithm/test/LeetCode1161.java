package com.zjc.algorithm.test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/7/31 21:27
 * @description : 1161. 最大层内元素和
 */
public class LeetCode1161 {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;
        int count = 1;
        int sum1 = Integer.MIN_VALUE;
        int sum = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                sum+=treeNode.val;
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            if (sum > sum1) {
                sum1 = sum;
                max = count;
            }
            sum = 0;
            count++;
        }
        return max;
    }
}
