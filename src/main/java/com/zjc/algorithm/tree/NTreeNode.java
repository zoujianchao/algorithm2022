package com.zjc.algorithm.tree;

import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/3/28
 * @description : N叉树
 */
public class NTreeNode {
    int val;
    List<NTreeNode> children;
    
    public NTreeNode() {
    }
    
    public NTreeNode(int val) {
        this.val = val;
    }
    
    public NTreeNode(int val, List<NTreeNode> children) {
        this.val = val;
        this.children = children;
    }
    
    public int getVal() {
        return val;
    }
    
    public void setVal(int val) {
        this.val = val;
    }
    
    public List<NTreeNode> getChildren() {
        return children;
    }
    
    public void setChildren(List<NTreeNode> children) {
        this.children = children;
    }
}
