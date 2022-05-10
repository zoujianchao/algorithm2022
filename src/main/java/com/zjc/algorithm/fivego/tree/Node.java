package com.zjc.algorithm.fivego.tree;

import java.util.List;

/**
 * @author : zoujianchao
 * @version : 1.0
 * @date : 2022/5/10
 * @description :
 */
public class Node {
    public int val;
    public List<Node> children;
    
    public Node(int val) {
        this.val = val;
    }
    
    public int getVal() {
        return val;
    }
    
    public void setVal(int val) {
        this.val = val;
    }
    
    public List<Node> getChildren() {
        return children;
    }
    
    public void setChildren(List<Node> children) {
        this.children = children;
    }
    
    public Node() {
    }
    
    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
