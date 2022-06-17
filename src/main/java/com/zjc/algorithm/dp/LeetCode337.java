package com.zjc.algorithm.dp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/17
 * @description : 337. 打家劫舍 III
 */
public class LeetCode337 {
    
    public int rob(TreeNode root) {
        int[] res = robAction(root);
        return Math.max(res[0], res[1]);
    }
    
    private int[] robAction(TreeNode root) {
        int[] res = new int[2];
        if (root == null) {
            return res;
        }
        int[] left = robAction(root.left);
        int[] right = robAction(root.right);
        
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = root.val + left[0] + right[0];
        
        return res;
    }
    
    
    //层序遍历不可以,因为有两个根在同一层且不相邻
//    public int rob(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        List<Integer> list = dfsSum(root);
//        if (list.size() == 1) {
//            return list.get(0);
//        }
//
//        int[] dp = new int[list.size()];
//        dp[0] = list.get(0);
//        dp[1] = Math.max(list.get(0), list.get(1));
//        for (int i = 2; i < list.size(); i++) {
//            dp[i] = Math.max(dp[i - 2] + list.get(i), dp[i - 1]);
//        }
//
//        return dp[list.size() - 1];
//    }
//
//    private List<Integer> dfsSum(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            int sum = 0;
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.poll();
//                sum += node.val;
//                if (node.left != null) {
//                    queue.offer(node.left);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                }
//            }
//            list.add(sum);
//        }
//        return list;
//    }
}
