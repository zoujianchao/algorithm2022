package com.zjc.algorithm.greedy;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/6/13
 * @description : 968. 监控二叉树
 */
public class LeetCode968 {
    int result = 0;
    public int minCameraCover(TreeNode root) {
        if (traversal(root) == 0) {
            result++;
        }
        return result;
    }
    
    public int traversal(TreeNode curr) {
        if (curr == null) {
            return -1;
        }
        int left = traversal(curr.left);
        int right = traversal(curr.right);
        //0 无覆盖 1 有摄像头 2 有覆盖
        if (left == 0 || right == 0) {
            result++;
            return 2;
        }
        
        if (left == 2 || right == 2) {
            return 1;
        }
        return 0;
    }
}
