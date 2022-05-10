package com.zjc.algorithm.fivego.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/10
 * @description : 589. N 叉树的前序遍历
 */
public class LeetCode589 {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        preorders(root, list);
        return list;
    }
    
    public static void preorders(Node node, List<Integer> res) {
        res.add(node.val);
        for (Node n : node.children) {
            if (n != null) {
                preorders(n, res);
            }
        }
    }
}
