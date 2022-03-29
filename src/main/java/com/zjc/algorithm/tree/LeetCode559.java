package com.zjc.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/29
 * @description : N 叉树的最大深度
 */
public class LeetCode559 {
//    public int maxDepth(NTreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//        int n = 0;
//        for (NTreeNode node : root.children) {
//            n = Math.max(n, maxDepth(node));
//        }
//        return n + 1;
//    }
    
    public int maxDepth(NTreeNode root) {
        if (root == null) {
            return 0;
        }
        int n = 0;
        Queue<NTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                NTreeNode node = queue.poll();
                for (NTreeNode node1 : node.children) {
                    queue.offer(node1);
                }
            }
            n++;
        }
        return n;
    }
}
