package com.zjc.algorithm.fivego.tree;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/10
 * @description : 572. 另一个树的子树
 */
public class LeetCode572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return check2(root, subRoot);
    }
    public static boolean check2(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }
        return check(s, t) || check2(s.left, t) || check2(s.right, t);
    }
    
    public static boolean check(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }else if (s == null || t == null || s.val != t.val) {
            return false;
        }else {
            return check(s.left, t.left) && check(s.right, t.right);
        }
    }
}
