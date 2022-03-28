package com.zjc.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/28
 * @description : N叉树的前序遍历
 */
public class LeetCode589 {
    public List<Integer> preorder(NTreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        preorders(root, list);
        return list;
    }
    
    public static void preorders(NTreeNode node, List<Integer> res) {
        res.add(node.val);
        for (NTreeNode n : node.children) {
            if (n != null) {
                preorders(n, res);
            }
        }
    }
    
}
