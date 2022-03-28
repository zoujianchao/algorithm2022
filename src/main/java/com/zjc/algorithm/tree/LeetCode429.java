package com.zjc.algorithm.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/28
 * @description : N 叉树的层序遍历
 */
public class LeetCode429 {
    public List<List<Integer>> levelOrder(NTreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<NTreeNode> queue = new LinkedList<>();
        
        if (root == null) {
            return list;
        }
        
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                NTreeNode node = queue.poll();
                res.add(node.val);
                queue.addAll(node.children);
            }
            list.add(res);
        }
        return list;
    }
}
