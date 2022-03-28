package com.zjc.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/28
 * @description : N叉树的后序遍历
 */
public class LeetCode590 {
    public List<Integer> postorder(NTreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        postorders(root, list);
        return list;
    }
    
    public static void postorders(NTreeNode node, List<Integer> res) {
        for (NTreeNode n : node.children) {
            if (n != null) {
                postorders(n, res);
            }
        }
        res.add(node.val);
    }
}
